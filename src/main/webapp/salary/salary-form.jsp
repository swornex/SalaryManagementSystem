<%@ include file="/templates/header.jsp" %>
<%@include file="/templates/isLoggedIn.jsp"%>

<h2 class="text-center my-4 text-muted fw-normal">Add Salary</h2>
<div class="container p-4 w-25 shadow rounded">
    <form action="salary-form" method="post">
        <div class="row flex-column p-2">
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Employee Id:</label>
                <input type="text" class="form-control" value="${salary.employeeId}" placeholder="1" name="employeeId">
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Basic Salary </label>
                <input type="text" class="form-control" value="${salary.basicSalary}" placeholder="5000"
                       name="basicSalary">
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Allowance:</label>
                <input type="text" class="form-control" value="${salary.allowance}" placeholder="10000" name="allowance">
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark" style="width:100%">${action}</button>
            </div>
        </div>
    </form>
</div>

<%@ include file="/templates/footer.jsp" %>

