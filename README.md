# Дипломный проект профессии «Тестировщик»

На локальном компьютере заранее должны быть установлены IntelliJ IDEA Ultimate и Docker

## Процедура запуска авто-тестов:

**1.** Склонировать на локальный репозиторий  [Дипломный проект](https://github.com/Leiza111/Diplom_QA) и открыть его в приложении IntelliJ IDEA Ultimate.

**2.** Открыть Docker;

**3.** В терминале развернуть контейнер с помощью команды 

    docker-compose up;

**4.** В новом терминале запустить целевое приложение:

     для mySQL - java -jar artifacts/aqa-shop.jar --spring.profiles.active=mysql 

     для postgresgl - java -jar artifacts/aqa-shop.jar --spring.profiles.active=postgresql;

**5.** Открыть браузер и пройти по [ссылке](http://localhost:8080/) ;

**5.** В новом терминале запустить тесты

    для mySQL - ./gradlew test -url=jdbc:mysql://localhost:3306/app -user=app -password=pass

    для postgresgl - ./gradlew test -url=jdbc:mysql://localhost:5432/app -user=app -password=pass ;

**6.** В новом терминале сформировать отчет командой 
    
    ./gradlew allureServe .


