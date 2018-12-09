<!DOCTYPE html>
<html>
 <#include "common/header.ftl">
 <body>
  <#include "common/navbar.ftl">
    <div class="jumbotron">
      <div class="container">
        <h2>National Library of Australia</h2>
          <p>A little reading is all the therapy a person needs sometimes.</p>
      </div>
    </div>
    <div class="container lead" role="main">
	    <p>${greetings}</p>
	    <p>In this application you can get a list of books and a list of people who borrow books.</p>
	    <p>Please use the menu at the top of this page to navigate to Books or People.</p>
        <p>For feedback, please contact Vandana Jaiswal on 0434 872 973</p>
	</div>
    </div>
    <#include "common/footer.ftl">
 </body>
</html>
