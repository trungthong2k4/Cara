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

        <section id="page-header" class="about-header">
            <h2>#KnowUs</h2>
            <p>Lorem ipsum dolor sit amet, consectetur</p>
        </section>

        <section id="about" class="section-p1">
            <div class="container about-box">
                <div class="row">
                    <div class="col-md-6">
                        <img src="./assets/img/about/a6.jpg" alt="" width="100%">
                    </div>
                    <div class="col-md-6">
                        <div class="about-details">
                            <h2>Who We Are</h2>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit quas doloribus pariatur,
                                aspernatur
                                error voluptates voluptate quidem quo omnis iste quasi. Ipsum sit dolor, labore nobis
                                dolorem
                                cupiditate accusantium saepe.</p>
                            <abbr title="">Lorem ipsum dolor sit amet consectetur adipisicing elit. Laboriosam,
                                officiis?</abbr>

                            <br><br>

                            <marquee bgcolor="#ccc" loop="'-1" scrollamout="5" width="100%">Lorem ipsum dolor sit amet
                                consectetur adipisicing elit.
                                Laboriosam, officiis?</marquee>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section id="about-app" class="section-p1">
            <h1>Download Our <a href="#">App</a></h1>
            <div class="video">
                <video autoplay muted src="./assets/img/about/1.mp4"></video>
            </div>
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

        <%@include file="./inc/footer.jsp" %>

    </body>

</html>
