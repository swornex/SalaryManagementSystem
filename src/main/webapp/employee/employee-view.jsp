<%@include file="/templates/header.jsp"%>

<h2 class="text-center mt-4 mx-auto text-muted fw-normal">View Employees</h2>
<div class="container w-75 my-4">
    <div class="btn-wrap d-flex flex-row-reverse mb-2">
        <a href="employee-form" class="btn btn-outline-secondary shadow">Add Employee</a>
    </div>
    <table class="table table-hover">
        <thead>
        <tr class="table-dark">
            <th class="text-center">Id</th>
            <th class="text-center">Name</th>
            <th class="text-center">Address</th>
            <th class="text-center">Contact</th>
            <th class="text-center">Department Name</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td class="text-center">${employee.id}</td>
                <td class="text-center">${employee.name}</td>
                <td class="text-center">${employee.address}</td>
                <td class="text-center">${employee.contact}</td>
                <td class="text-center">${employee.departmentName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/templates/footer.jsp"%>