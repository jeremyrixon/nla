<!DOCTYPE html>
<html lang="en">
<#include "common/header.ftl">
<body>
<#include "common/navbar.ftl">

<!-- https://getbootstrap.com/docs/ -->
<div class="jumbotron">
    <div class="container">
        <h2>Books</h2>
        <p>A list of books is below.</p>
    </div>
</div>
<div class="container" role="main">
    <div id="books">
        <br/>
        <table class="table">
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>ISBN</th>
            </tr>
        <#list bookList as book>
            <tr>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
            </tr>
        </#list>
        </table>
    </div>
</div><!-- /.container -->
<#include "common/footer.ftl">
</body>
</html>
<html>
<body>
