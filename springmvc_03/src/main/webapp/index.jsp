<html>
<head>
    <title>Title</title>
</head>
<%@page pageEncoding="UTF-8" %>

<body>
<form action="getDataByPojo" method="post">
    <p>姓名:<input type="text" name="pname"></p>
    <p>age:<input type="text" name="page"></p>
    <p>sex::
        <input type="radio" name="gender" value="1">male
        <input type="radio" name="gender" value="0">female
    </p>
    <p>hobby
        <input type="checkbox" name="hobby" value="1"> basketball
        <input type="checkbox" name="hobby" value="2"> football
        <input type="checkbox" name="hobby" value="3"> volleyball
    </p>birthday
    <p>
        <input type="text" name="birthdate">
    </p>
    宠物:
    <p>
        pet1: name:<input type="text" name="pets[0].petName" >type:<input type="text" name="pets[0].petType">
    </p>
    <p>
        pet2: name:<input type="text" name="pets[1].petName" >type:<input type="text" name="pets[1].petType">
    </p>
    petMap:
    <p>
        pet1: name:<input type="text" name="petMap['a'].petName" >type:<input type="text" name="petMap['a'].petType">
    </p>
    <p>
        pet2: name:<input type="text" name="petMap['b'].petName" >type:<input type="text" name="petMap['b'].petType">
    </p>
    fruits:
    <p>
        fruit: name:<input type="text" name="fruit.FruitName" >type:<input type="text" name="fruit.FruitType">
    </p>
    <input type="submit">
</form>
</body>
</html>
