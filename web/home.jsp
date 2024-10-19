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

        <section id="hero">
            <h4>Trade-in-offer</h4>
            <h2>Super value deals</h2>
            <h1>On all products</h1>
            <p>Save more with coupons & up to 70% off!</p>
            <button>Shop Now</button>
        </section>

        <section id="features" class="section-p1">
            <div class="container">
                <div class="fe-box">
                    <img src="./assets/img/features/f1.png" alt="">
                    <h6>Free Shipping</h6>
                </div>
                <div class="fe-box">
                    <img src="./assets/img/features/f2.png" alt="">
                    <h6>Online Order</h6>
                </div>
                <div class="fe-box">
                    <img src="./assets/img/features/f3.png" alt="">
                    <h6>Save Money</h6>
                </div>
                <div class="fe-box">
                    <img src="./assets/img/features/f4.png" alt="">
                    <h6>Promotions</h6>
                </div>
                <div class="fe-box">
                    <img src="./assets/img/features/f5.png" alt="">
                    <h6>Happy Sell</h6>
                </div>
                <div class="fe-box">
                    <img src="./assets/img/features/f6.png" alt="">
                    <h6>F24/7 Support</h6>
                </div>
            </div>
        </section>

        <section id="product1" class="section-p1">
            <h2>Featured Products</h2>
            <p>Summer Collection New Morden Design</p>
            <div class="prod-cont">
                <c:forEach var="product" items="${hotProductList}">
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

        <section id="banner" class="section-m1">
            <h4>Repair Services</h4>
            <h2>Up to <span>70% Off</span> - All t-Shirts & Accessories</h2>
            <button class="normal">Expore More</button>
        </section>

        <section id="product1" class="section-p1">
            <h2>New Arrivals</h2>
            <p>Summer Collection New Morden Design</p>
            <div class="prod-cont">
                <c:forEach var="product" items="${newsProductList}">
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

        <section id="sm-banner" class="section-p1">
            <div class="banner-box">
                <h4>crazy deals</h4>
                <h2>buy 1 get 1 free</h2>
                <span>The best classic dress is on sale at cara</span>
                <button class="white">Learn More</button>
            </div>
            <div class="banner-box banner-box2">
                <h4>spring/summer</h4>
                <h2>upcomming season</h2>
                <span>The best classic dress is on sale at cara</span>
                <button class="white">Collection</button>
            </div>
        </section>

        <section id="l-banner">
            <div class="banner-box">
                <h2>SEASONAL SALE</h2>
                <h3>Winter Collection -50% OFF</h3>
            </div>
            <div class="banner-box banner-box2">
                <h2>NEW FOOTWEAR COLLECTION</h2>
                <h3>Spring / Summer 2022</h3>
            </div>
            <div class="banner-box banner-box3">
                <h2>T-SHIRTS</h2>
                <h3>New Trendy Prints</h3>
            </div>
        </section>

        <%@include file="./inc/footer.jsp" %>

    </body>

</html>
