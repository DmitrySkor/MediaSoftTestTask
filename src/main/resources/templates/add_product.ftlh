<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Добавление товара</title>
</head>
<body>
<h2><a href="/products">К списку товаров</a></h2>
<h1>Добавление товара</h1>
<form action="/products" method="post">
    <label>Категория товара:
        <input type="text" name="category" required placeholder="Введите категорию..." autofocus>
    </label>
    <label>Наименование:
        <input type="text" name="name" required placeholder="Введите наименование...">
    </label>
    <label>Описание товара:
        <input type="text" name="description" required placeholder="Введите описание товара...">
    </label>
    <label>Цена:
        <input type="number" step="any" name="price" required placeholder="Введите цену...">
    </label>
    <label>Количество:
        <input type="number" name="quantity" required placeholder="Введите количество...">
    </label>
    <input type="submit" value="Добавить">
</form>
</body>
</html>
