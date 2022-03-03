<%@ include file="/templates/header.jsp" %>

<h2 class="text-center mt-4">Add Salary</h2>
<div class="container w-50 mr-0">
    <form action="salary-form" method="post">
        <div class="mb-3">
            <label class="form-label">Name:</label>
            <input type="text" class="form-control" value="${salary.employeeId}" placeholder="1" name="employeeId">
        </div>
        <div class="mb-3">
            <label class="form-label">Basic Salary </label>
            <input type="text" class="form-control" value="${salary.basicSalary}" placeholder="5000"
                   name="basicSalary">
        </div>
        <div class="mb-3">
            <label class="form-label">Allowance:</label>
            <input type="text" class="form-control" value="${salary.allowance}" placeholder="10000" name="allowance">
        </div>
        <button type="submit" class="btn btn-primary">${action}</button>
    </form>
</div>

<%@ include file="/templates/footer.jsp" %>
