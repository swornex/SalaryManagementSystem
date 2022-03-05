<%@include file="/templates/header.jsp"%>
<%@include file="/templates/isLoggedIn.jsp"%>

<h2 class="text-center my-4 text-muted fw-normal">Add Employee</h2>
<div class="container p-4 w-25 shadow rounded">
    <form action="employee-form" method="post">
        <div class="row flex-column p-2">
            <input type="hidden" value="${employee.id}" name="id">
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Name:</label>
                <input type="text" class="form-control" value="${employee.name}" placeholder="John Doe" name="name" required>
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Address: </label>
                <input type="text" class="form-control" value="${employee.address}" placeholder="Putalisadak"
                       name="address" required>
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Contact:</label>
                <input type="text" class="form-control" value="${employee.contact}" placeholder="9801000000"
                       name="contact" required>
            </div>
            <div class="col-md align-self-center mb-3">
                <label class="form-label">Department:</label>
                <input type="text" class="form-control" value="${employee.departmentName}" placeholder="AI"
                       name="departmentName" required>
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark" style="width:100%">Submit</button>
            </div>
        </div>
    </form>
</div>
<%@include file="/templates/footer.jsp" %>
