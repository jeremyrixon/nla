<!DOCTYPE html>
<html lang="en">
<#include "common/header.ftl">
<body>
<#include "common/navbar.ftl">

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">
        <h2>People</h2>
        <p>A list of people is below.</p>
        <p>On clicking a person, you can view list of books lent by the person.</p>
        <p>To hide the list, click again on the person.</p>
    </div>
</div>
<div class="container" role="main">
    <div>
        <br/>
        <table id="people" class="table table-hover people">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Contact Number</th>
                <th>Email</th>
            </tr>
        <#list personList as person>
            <tr id=${person.id}>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                <td>${person.contactNumber}</td>
                <td>${person.email}</td>
            </tr>
        <#else>
        <p>No people
        </#list>
        </table>
    </div>
</div>
<#include "common/footer.ftl">
<script src="/js/people-book-inline-table.js"></script>
</body>
</html>
