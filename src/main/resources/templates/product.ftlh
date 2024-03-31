<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Товар ${product.name}</title>
    <style type="text/css">
        TABLE {
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
            width: 300px; /* Ширина таблицы */
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
            padding: 5px; /* Поля вокруг текста */
        }
    </style>
</head>
<body>
<h3><a href="/products">К списку товаров</a> </h3>
<h3><a href="/products/add">Добавление товара</a> </h3>
<br>
<h1>Страница товара</h1>
<table>
    <thead>
    <tr>
        <th>Артикул</th>
        <th>Категория</th>
        <th>Наименование</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Количество</th>
        <th>Дата создания</th>
        <th>Дата и время последнего изменения количества</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${product.id}</td>
        <td>${product.category}</td>
        <td>${product.name}</td>
        <td>${product.description}</td>
        <td>${product.price}</td>
        <td>${product.quantity}</td>
        <td>${product.dateOfCreation}</td>
        <td>${product.dateOfLastQuantityChange}</td>
    </tr>
    </tbody>
</table>
<br>
<form action="/products/${product.id}/update" method="post">
    <label>Категория:
        <input type="text" name="category" value="${product.category}">
    </label>
    <label>Наименование:
        <input type="text" name="name" value="${product.name}">
    </label>
    <label>Описание:
        <input type="text" name="description" value="${product.description}">
    </label>
    <label>Цена:
        <input type="number" step="any" name="price" value="${product.price}">
    </label>
    <label>Количество:
        <input type="number" name="quantity" value="${product.quantity}">
    </label>
    <input type="submit" value="Сохранить">
</form>
</body>
</html>
