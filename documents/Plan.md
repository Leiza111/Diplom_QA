# План автоматизации покупки тура Марракэш
Необходимо в приложении приобрести тур по определённой цене с помощью двух способов:

- Обычная оплата по дебетовой карте;
- Уникальная технология: выдача кредита по данным банковской карты.
## Перечень автоматизируемых сценариев

**Позитивные сценарии**

Необходимо произвести проверки в каждой вкладке: сначала во вкладке "Купить", затем во вкладке "Купить в кредит". 

Проверки в каждой вкладке идентичные.

1. С помощью карты "4444 4444 4444 4441" со статусом "APPROVED" с вводом валидных данных;
2. В поле "Владелец" ввести ФИО, содержаще букву "ё";
3. В поле "Владелец" ввести двойное имя или фамилию через тире;


Ожидаемый результат: После ввода валидных данных справа сверху всплывет черное окошечко с надписью "Успешно. Операция одобрена банком."

4. С помощью карты "4444 4444 4444 4442" со статусом "DECLINED" с вводом валидных данных;

Ожидаемый результат: После ввода валидных данных справа сверху всплывет черное окошечко с надписью "Ошибка! Банк отказал в проведении операции", ФР - Ошибка! Банк отказал в проведении операции" - БАГ




**Негативные сценарии**

Необходимо произвести проверки в каждой вкладке: сначала во вкладке "Купить", затем во вкладке "Купить в кредит". 

Проверки в каждой вкладке идентичные.

1. В поле "Номер карты" ввести номер карты, содержащую меньше 16 цифр, ОР-снизу под полем выведется запись красного цвета "Неверный формат";
2. В поле "Номер карты" ввести номер карты, содержащие 16 нулей, ОР-снизу под полем выведется запись красного цвета "Неверный формат";
3. В поле "Номер карты" ввести номер карты, содержащие латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.), ОР-система не позволит ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.) ;
4. Поле "Номер карты" оствить пустым, ОР-снизу под полем выведется запись красного цвета "Неверный формат"; 


5. В поле "Месяц" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.),ОР-система не позволит ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.) ;
6. В поле "Месяц" ввести  номер месяца больше 12, ОР-снизу под полем выведется запись красного цвета "Неверно указан срок действия карты";
7. Поле "Месяц" оствить пустым, ОР-снизу под полем выведется запись красного цвета "Поле обязательно для заполнения";


8. В поле "Год" ввести прошедший год, ОР-снизу под полем выведется запись красного цвета "Истёк срок действия карты"; 
9. В поле "Год" ввести год на 6 лет больше текущего года, ОР-снизу под полем выведется запись красного цвета "Неверно указан срок действия карты";
10. В поле "Год" ввести нулевой год "00", ОР-снизу под полем выведется запись красного цвета "Истёк срок действия карты"; 
11. В поле "Год" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.), ОР-система не позволит ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.) ;
12. Поле "Год" оствить пустым,  ОР-снизу под полем выведется запись красного цвета "Поле обязательно для заполнения";
13. В поле "Владелец" ввести только имя, либо только фамилию, либо только отчество, ОР-снизу под полем выведется запись красного цвета "Неверный формат", ФР - "Операция одобрена Банком" - БАГ;
14. В поле "Владелец" ввести только имя фамилию и отчество с маленькой буквы, ОР-снизу под полем выведется запись красного цвета "Неверный формат". ФР - "Операция одобрена Банком" - БАГ;
15. В поле "Владелец" ввести более 30 символов,  ОР-снизу под полем выведется запись красного цвета "Поле не может содержать более 30 букв", ФР - "Операция одобрена Банком" - БАГ;
16. В поле "Владелец" ввести  латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.), ОР-снизу под полем выведется запись красного цвета "Неверный формат". ФР - "Операция одобрена Банком" - БАГ;
17. Поле "Владелец" оствить пустым,  ОР-снизу под полем выведется запись красного цвета "Поле обязательно для заполнения";


18. В поле "CVC/CVV" ввести "нули", ОР-снизу под полем выведется запись красного цвета "Неверный формат". ФР - "Операция одобрена Банком" - БАГ;
19. В поле "CVC/CVV" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.), ОР-система не позволит ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.) ;
20. Поле "CVC/CVV" оствить пустым,  ОР-снизу под полем выведется запись красного цвета "Поле обязательно для заполнения";

## Перечень используемых инструментов с обоснованием выбора
1. IntelliJ IDEA Ultimate - это интеллектуальная IDE, учитывающая контекст. Она предназначена для разработки разнообразных приложений на Java;
2. Java 11 - язык программирования, на котором будут написаны автотесты;
3. JUnit5 - это инфраструктура модульного тестирования для Java следующего поколения, оснащенная множеством функций;
4. Gradle - система автоматизации сборки и управления зависимостями;
5. JavaFaker - это библиотека, которую можно использовать для создания широкого спектра реальных данных от адресов до ссылок на популярные культуры.
6. Docker - это стандартизированное ПО для разработки и развёртывания проектов;
7. Allure - это фреймворк для сбора данных и построения отчетов о тестировании кода.
8. Github -  это сайт-хранилище для историй версий проектов

## Перечень и описание возможных рисков при автоматизации

1. Возможны проблемы с подключением и настройкой тестируемого окружения и СУБД;
2. Изменение структуры страницы (html, css) - недоступность css-селекторов для проверки;
3. Большое количество багов, которые увеличат время тестирования.


## Интервальная оценка с учётом рисков (в часах)

1. Планирование автоматизации тестироавния (изучение тех.документации, подготовка проекта) - 8 часов;
2. Непостредственно сама автоматизация (написание тестов и запуск тестов) - 56 часов;
3. Подготовка отчетных документов по итогам автоматизации - 10 часов.

## План сдачи работ (когда будут авто-тесты, результаты их прогона и отчёт по автоматизации)

1. План по автоматизации тестирования - до 28.03.22;
2. Написание и запуск тестов - до 13.04.22;
3. Подготовка отчёта по автоматизации  - до 19.04.22.