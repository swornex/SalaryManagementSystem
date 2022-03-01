<%@include file="/templates/header.jsp"%>
<h2 class="text-center my-4 text-muted">Add Employee</h2>
<div class="container p-4 w-25 shadow rounded">
    <form action="employee-form" method="post">
        <div class="row flex-column p-2">
            <input type="hidden" value="${employee.id}" name="id">
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Name:</label>
                <input type="text" class="form-control" value="${employee.name}" placeholder="John Doe" name="name">
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Address: </label>
                <input type="text" class="form-control" value="${employee.address}" placeholder="Putalisadak"
                       name="address">
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Contact:</label>
                <input type="text" class="form-control" value="${employee.contact}" placeholder="9801000000"
                       name="contact">
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Department Name: </label>
                <select name="departmentName" class="form-select">
                    <option disabled ${empDepartment != null ? "" : "selected"}> --- Select Department ---</option>
                    <option value="AI">AI</option>
                    <option value="Machine Learning">Machine Learning</option>
                    <option value="Web Developer">Web Developer</option>
                </select>
            </div>
            <div class="button d-flex justify-content-center">
                <a href="${action}" class="btn btn-dark">Submit</a>
            </div>
        </div>
    </form>
</div>
<%@include file="/templates/footer.jsp" %>
