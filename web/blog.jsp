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

        <section id="page-header" class="blog-header">
            <h2>#readmore</h2>
            <p>Read all case studies about our products!</p>
        </section>

        <section id="blog">
            <div class="container blog-box">
                <div class="row">
                    <div class="col-md-6">
                        <div class="blog-img">
                            <img class="poi-img" src="./assets/img/blog/b1.jpg" alt="">
                            <h1>6/12</h1>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="blog-details">
                            <h4>The Cotton-Jersey Zip-up Hoodie</h4>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In sed voluptate incidunt
                                deleniti labore eaque nostrum reiciendis obcaecati. Numquam harum maxime doloribus quod
                                ea veniam ab odio in, ad autem...</p>
                            <a href="#">CONTINUE READING</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container blog-box">
                <div class="row">
                    <div class="col-md-6">
                        <div class="blog-img">
                            <img class="poi-img" src="./assets/img/blog/b2.jpg" alt="">
                            <h1>4/12</h1>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="blog-details">
                            <h4>How to Style a Quiff</h4>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In sed voluptate incidunt
                                deleniti labore eaque nostrum reiciendis obcaecati. Numquam harum maxime doloribus quod
                                ea veniam ab odio in, ad autem...</p>
                            <a href="#">CONTINUE READING</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container blog-box">
                <div class="row">
                    <div class="col-md-6">
                        <div class="blog-img">
                            <img class="poi-img" src="./assets/img/blog/b3.jpg" alt="">
                            <h1>1/12</h1>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="blog-details">
                            <h4>Must-Have Skater Girl Items</h4>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In sed voluptate incidunt
                                deleniti labore eaque nostrum reiciendis obcaecati. Numquam harum maxime doloribus quod
                                ea veniam ab odio in, ad autem...</p>
                            <a href="#">CONTINUE READING</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container blog-box">
                <div class="row">
                    <div class="col-md-6">
                        <div class="blog-img">
                            <img class="poi-img" src="./assets/img/blog/b4.jpg" alt="">
                            <h1>29/11</h1>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="blog-details">
                            <h4>Runway-inspired Trends</h4>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In sed voluptate incidunt
                                deleniti labore eaque nostrum reiciendis obcaecati. Numquam harum maxime doloribus quod
                                ea veniam ab odio in, ad autem...</p>
                            <a href="#">CONTINUE READING</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container blog-box">
                <div class="row">
                    <div class="col-md-6">
                        <div class="blog-img">
                            <img class="poi-img" src="./assets/img/blog/b6.jpg" alt="">
                            <h1>28/11</h1>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="blog-details">
                            <h4>AW20 Menswear Trends</h4>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In sed voluptate incidunt
                                deleniti labore eaque nostrum reiciendis obcaecati. Numquam harum maxime doloribus quod
                                ea veniam ab odio in, ad autem...</p>
                            <a href="#">CONTINUE READING</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section id="pagination" class="section-p1">
            <a href="#">1</a>
            <a href="#">2</a>
            <a href="#"><i class="fa-solid fa-arrow-right"></i></a>
        </section>

        <%@include file="./inc/footer.jsp" %>

    </body>

</html>
