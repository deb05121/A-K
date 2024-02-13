SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

World_queries_2.sql
1.
SELECT count(code) AS COUNTRIES, Continent FROM world.country GROUP BY Continent ORDER BY count(code) DESC;

2.
SELECT world.country.Name AS COUNTRY, world.city.Name AS CAPITAL
FROM world.country INNER JOIN world.city ON world.country.Capital=world.city.ID 
WHERE Continent='ASIA'
ORDER BY world.country.Name;

3.
SELECT world.country.Name, world.city.Name, world.city.Population
FROM world.country INNER JOIN world.city ON world.country.Code=world.city.CountryCode 
WHERE world.country.Name='Brazil'
ORDER BY world.city.Population DESC;

4.
SELECT CountryCode, COUNT(Name) FROM world.city GROUP BY CountryCode ORDER BY COUNT(Name) DESC;

5.
CREATE TABLE world.result(SELECT CountryCode, SUM(Population) AS SUMMA FROM world.city GROUP BY CountryCode);

SELECT world.country.Name AS COUNTRY, world.city.Name AS CITY, world.city.Population, world.result.SUMMA, 
FORMAT((world.city.Population/ world.result.SUMMA *100), 1) AS percentage FROM world.city
INNER JOIN world.result ON world.result.CountryCode=world.city.CountryCode
INNER JOIN world.country ON world.country.Code=world.city.CountryCode
ORDER BY world.country.Name;

6.
a.
CREATE TABLE world.Official(SELECT world.countrylanguage.Countrycode, count(world.countrylanguage.IsOfficial) AS Languages FROM world.countrylanguage 
WHERE world.countrylanguage.IsOfficial='T' GROUP BY world.countrylanguage.countrycode);

SELECT world.country.Name, world.country.Population FROM world.countrylanguage 
INNER JOIN world.official ON world.countrylanguage.CountryCode=world.official.Countrycode
INNER JOIN world.country ON world.country.Code=world.countrylanguage.CountryCode
WHERE world.official.Languages>1
GROUP BY world.country.Code
ORDER BY Population DESC;

b.
SELECT world.country.Name, MAX(world.official.Languages) AS OFFICIAL_LANGUAGES FROM world.countrylanguage 
INNER JOIN world.official ON world.countrylanguage.CountryCode=world.official.Countrycode
INNER JOIN world.country ON world.country.Code=world.countrylanguage.CountryCode
WHERE world.official.Languages>1
GROUP BY world.country.Code
ORDER BY world.official.Languages DESC,  world.country.Name;

7.
(5)
SELECT world.country.Name AS COUNTRY, world.city.Name AS CITY, world.city.Population, world.result.SUMMA, 
FORMAT((world.city.Population/ world.result.SUMMA *100), 1) AS percentage FROM world.city
INNER JOIN world.result ON world.result.CountryCode=world.city.CountryCode
INNER JOIN world.country ON world.country.Code=world.city.CountryCode
ORDER BY world.country.Name, world.city.Name;

8.
SELECT * FROM world.city ORDER BY Population DESC LIMIT 3;

9.
SELECT world.country.Name, world.country.Population, world.countrylanguage.Percentage AS GERMAN FROM world.countrylanguage
INNER JOIN world.country ON world.country.Code= world.countrylanguage.CountryCode
 WHERE Language = 'GERMAN'
 ORDER BY world.country.Name;
 ( ORDER BY world.country.Population DESC;)
 
10.
SELECT world.city.Name AS CITY, world.country.Name AS COUNTRY FROM world.city
LEFT JOIN world.country ON world.city.ID = world.country.Capital ;

11.
CREATE TABLE indep_year_frequency(SELECT world.country.IndepYear, COUNT(world.country.Name) FROM world.country
WHERE IndepYear>0
GROUP BY world.country.IndepYear);

SELECT * FROM world.indep_year_frequency
WHERE FREQUENCY=(SELECT MAX(FREQUENCY) FROM world.indep_year_frequency)
ORDER BY IndepYear DESC;

12.
SELECT world.countrylanguage.Language, SUM((world.countrylanguage.Percentage*world.country.Population)/100) AS SPEAKER 
FROM world.countrylanguage
INNER JOIN world.country ON world.country.Code=world.countrylanguage.CountryCode
GROUP BY world.countrylanguage.Language
ORDER BY SPEAKER DESC LIMIT 5;

13.
SELECT world.countrylanguage.Language, SUM((world.countrylanguage.Percentage*world.country.Population)/100) AS SPEAKER 
FROM world.countrylanguage
INNER JOIN world.country ON world.country.Code=world.countrylanguage.CountryCode
GROUP BY world.countrylanguage.Language
HAVING SPEAKER=0
ORDER BY Language;

14A.
SELECT world.country.Name, world.country.Continent, world.country.Population 
FROM world.country 
WHERE world.country.Continent NOT LIKE 'EUROPE'
AND ABS(world.country.Population-(SELECT Population FROM world.country WHERE world.country.Code='NLD'))
ORDER BY ABS(world.country.Population-(SELECT Population FROM world.country WHERE world.country.Code='NLD'))
LIMIT 1;

14B.
SELECT world.country.Name, world.country.Continent, world.country.Population, world.country.SurfaceArea, world.country.Population/world.country.SurfaceArea
FROM world.country 
WHERE world.country.Continent LIKE 'AFRICA'
AND ABS((world.country.Population/world.country.SurfaceArea)-
(SELECT Population/SurfaceArea FROM world.country WHERE world.country.Code='HUN'))
ORDER BY ABS((world.country.Population/world.country.SurfaceArea)-
(SELECT Population/SurfaceArea FROM world.country WHERE world.country.Code='HUN'))
LIMIT 1;
