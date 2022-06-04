<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Notes</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h3>Edit Note</h3>
        <form method="POST" action="notes">
            <div>
                <label for="title">Title:</label>
                <p>${title}</p>
            </div><br>
            <div>
                 <label for="content">Contents:</label>
                 <p>${content}</p>
            </div><br>
            <a href="notes?edit='true'">Edit</a>
        </form>
    </body>
</html>
