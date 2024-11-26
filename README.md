## Лабораторная работа №1: Поиск определителя матрицы
Для создания проекта был использован инструмент **Maven**. Ниже приведены основные шаги по созданию, настройке и использованию проекта.

### Создание проекта

Для создания проекта была выполнена следующая команда:

```bash
mvn archetype:generate -DgroupId=ru.spbstu.telematics.java -DartifactId=lab1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
### Зависимости, добавленные в проект:

- JUnit (4.12)
Используется для написания и выполнения тестов.

- Commons IO (2.5)
Библиотека для работы с вводом/выводом файлов.

- Commons Math (3.6)
Библиотека для выполнения математических вычислений.


### Плагины для упрощения сборки и выполнения проекта:

- exec-maven-plugin (1.4.0)
Плагин для выполнения Java-программ с помощью Maven.


- maven-jar-plugin (3.2.0)
Плагин для упаковки проекта в JAR-файл.

### Команды для работы с проектом:

Компиляция исходного кода:
```
mvn compile
```

Запуск приложения с использованием плагина exec-maven-plugin:
```
mvn exec:java
```
Сборка JAR-файла:
```
mvn package
```
Запуск JAR-файла:
```
java -jar target/lab1-1.0-SNAPSHOT.jar
```
### Тестирование
Для тестирования использовалась следующая команда:
```
mvn test
```
Эта команда запускает все тесты, написанные в проекте, с использованием JUnit.