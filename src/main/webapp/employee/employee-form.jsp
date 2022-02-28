<%@ include file="/templates/header.jsp" %>

<h2 class="text-center mt-4">Add Employee</h2>
<div class="container w-50 mr-0">
    <form action="employee-form" method="post">
        <input type="hidden" value="${employee.id}" name="id">
        <div class="mb-3">
            <label class="form-label">Name:</label>
            <input type="text" class="form-control" value="${employee.name}" placeholder="John Doe" name="name">
        </div>
        <div class="mb-3">
            <label class="form-label">Address: </label>
            <input type="text" class="form-control" value="${employee.address}" placeholder="Putalisadak"
                   name="address">
        </div>
        <div class="mb-3">
            <label class="form-label">Contact:</label>
            <input type="text" class="form-control" value="${employee.contact}" placeholder="9801000000" name="contact">
        </div>
        <div class="mb-3">
            <label class="form-label">Department Name:</label>
            <input type="text" class="form-control" value="${employee.departmentName}" placeholder="Developer"
                   name="departmentName">
        </div>
        <button type="submit" class="btn btn-primary">${action}</button>
    </form>
</div>

<%@ include file="/templates/footer.jsp" %>
