<%@include file="templates/header.jsp"%>
<div class="container vh-100 d-flex align-items-center">
    <div class="text-center">
        <img src="assets/img/access_account.png" style="width: 450px" alt="access-account">
    </div>
    <div class="form-wrapper w-25 mx-auto p-4 shadow rounded">
        <form action ="login" method="post">
            <h2 class="text-center mt-2 mb-4 p-1 text-dark">LOGIN</h2>
            <div class="mb-3">
                <label class="form-label">Username:</label>
                <input type="text" class="form-control" placeholder="admin" name="username">
            </div>
            <div class="mb-3">
                <label class="form-label">Password:</label>
                <input type="password" class="form-control" placeholder="admin123" name="password">
            </div>
<%--            <p class="text-danger">${error}</p>--%>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark">Login</button>
            </div>
        </form>
    </div>
</div><%@include file="templates/footer.jsp"%>

