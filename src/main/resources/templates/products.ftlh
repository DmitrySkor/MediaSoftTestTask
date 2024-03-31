<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Список товаров</title>
    <style type="text/css">
        TABLE {
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
            width: 500px; /* Ширина таблицы */
        }
        TH {
            background: #aff37b; /* Цвет фона ячейки */
            text-align: center; /* Выравнивание по левому краю */
        }
        TD {
            background: #fff; /* Цвет фона ячеек */
            text-align: center; /* Выравнивание по центру */
        }
        TH, TD {
            border: 1px solid black; /* Параметры рамки */
            padding: 7px; /* Поля вокруг текста */
        }
    </style>
</head>
<body>
<h2><a href="products/add">Добавление товара</a></h2>
<h1>Список товаров</h1>
<table>
    <caption><strong>Доступные товары</strong></caption>
    <thead>
    <tr>
        <th>Артикул</th>
        <th>Категория товара</th>
        <th>Наименование</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Количество</th>
        <th>Дата создания</th>
        <th>Дата и время последнего изменения количества</th>
        <th>Действие</th>
    </tr>
    </thead>
    <tbody>
    <#list products as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.category}</td>
            <td><a href="/products/${product.id}">${product.name}</a></td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>${product.dateOfCreation}</td>
            <td>${product.dateOfLastQuantityChange}</td>
            <td>
                <form action="/products/${product.id}/delete" method="post">
                    <input type="submit" value="Удалить">
                </form>
            </td>
        </tr>
    </#list>
    </tbody>
</table>
</body>
</html>
