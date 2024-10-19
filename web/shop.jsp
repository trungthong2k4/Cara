<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cara</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
              integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="./assets/css/style.css">
    </head>

    <body>

        <%@include file="./inc/header.jsp" %>

        <section id="page-header">
            <h2>#stayhome</h2>
            <p>Save more with coupons & up to 70% off!</p>
        </section>

        <section id="product1" class="section-p1">
            <div class="prod-cont">
                <c:forEach var="product" items="${productList}">
                    <div class="prod">
                        <a href="ProductServlet?productId=${product.id}&categoryId=${product.categoryId}"><img src="${product.thumbnail}" alt=""></a>
                        <div class="des">
                            <span>adidas</span>
                            <h5>${product.name}</h5>
                            <div class="star">
                                <i class="fas fa-star"></i>
                                <i class="fas fa-star"></i>
                                <i class="fas fa-star"></i>
                                <i class="fas fa-star"></i>
                                <i class="fas fa-star"></i>
                            </div>
                            <h4>$${product.price}</h4>
                        </div>
                        <a href="#"><i class="fa-solid fa-cart-shopping cart"></i></a>
                    </div>
                </c:forEach>
            </div>
        </section>

        <section id="pagination" class="section-p1">
            <c:forEach var="i" begin="${startPage}" end="${endPage}">
                <a <c:if test="${i == page}">class="active"</c:if> href="ShopServlet?page=${i}">${i}</a>
            </c:forEach>
            <c:if test="${endPage < numberPage}">
                <a href="ShopServlet?page=${endPage + 1}">...</a> 
            </c:if>
            <c:if test="${page < numberPage}">
                <a href="ShopServlet?page=${page + 1}"><i class="fa-solid fa-arrow-right"></i></a>
            </c:if>
        </section>

        <%@include file="./inc/footer.jsp" %>

    </body>

</html>
