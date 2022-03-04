<%@include file="templates/header.jsp"%>
<div class="container vh-100 d-flex align-items-center">
    <div class="login-wrapper mx-auto d-flex align-items-center justify-content-center flex-row">
        <img src="assets/img/access_account.svg" class="me-5" style="width: 300px" alt="access-account">
        <div class="form-wrapper w-50 ms-5 p-4 shadow rounded">
            <form class="mb-3" action ="login" method="post">
                <h2 class="text-center mt-2 mb-4 p-1 text-dark">LOGIN</h2>
                <div class="mb-3 mx-2">
                    <label class="form-label">Username:</label>
                    <input type="text" class="form-control"  value = "${username}" placeholder="admin" name="username">
                </div>
                <div class="mb-3 mx-2">
                    <label class="form-label">Password:</label>
                    <input type="password" class="form-control" placeholder="admin123" name="password">
                </div>
                <p class = "text-danger">${error != null ? error : ""}</p>
                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-dark">Login</button>
                </div>
            </form>
        </div>
    </div>
</div><%@include file="templates/footer.jsp"%>

