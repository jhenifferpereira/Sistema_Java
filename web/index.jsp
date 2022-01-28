<%-- 
    Document   : index
    Created on : 31/08/2021, 21:31:41
    Author     : jhe13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/fontAwesome.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/hero-slider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/owl-carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/templatemo-style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

        <link href="https://fonts.googleapis.com/css?family=Spectral:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">

        <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>

    <title>Cervejaria</title>
</head>
<body>
    <div class="header">
        <div class="container">
            <a href="#" class="navbar-brand scroll-top">Emporium Beer</a>
            <nav class="navbar navbar-inverse" role="navigation">
                <div class="navbar-header">
                    <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <!--/.navbar-header-->
                <div id="main-nav" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="index.html">Home</a></li>
                        <li><a href="menu.html">Cervejas</a></li>
                        <li><a href="blog.html">estilados</a></li>
                        <li><a href="contact.html">Sobre</a></li>
                        <li><a href="sign.jsp">Entre</a></li>
                    </ul>
                </div>
                <!--/.navbar-collapse-->
            </nav>
            <!--/.navbar-->
        </div>
        <!--/.container-->
    </div>
    <!--/.header-->


    <section class="banner">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-1">
                    
                    <h2>Cervejaria</h2>
                    <p>Fazemos produtos que são a nossa paixão, a paixão nacional.
                         E promovemos e participamos dos momentos de celebração dos brasileiros.</p>
                    <div class="primary-button">
                        <a href="#" class="scroll-link" data-id="book-table">Conheça a nossa produção</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="services">
        <div class="container">
            <div class="row ">
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="service-item">
                        <a href="menu.html">
                        <img src="img/franz.jpg" alt="Breakfast">
                        <h4>Cerveja Franziskaner Hefe Weissbier Hell 500ml</h4>
                        </a>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="service-item">
                        <a href="menu.html">
                        <img src="img/imigr.jpg" alt="Lunch">
                        <h4>Cerveja Imigração Weiss 500ml</h4>
                        </a>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="service-item">
                        <a href="menu.html">
                        <img src="img/antuer.jpg" alt="Dinner">
                        <h4>Cerveja Antuérpia Weissbier Trigo 500ml</h4>
                         </a>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="service-item">
                        <a href="menu.html">
                        <img src="img/austri.jpg" alt="Desserts">
                        <h4>Cerveja Krug Austria Hefe Weizen 600ml</h4>
                         </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="featured-food">
        <div class="container">
            <div class="row">
                <div class="heading">
                    <h2>Emporium Beer</h2>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="food-item">
                        <h2>Cervejas mportadas</h2>
                        <img src="img/cerimpor.png" alt="">
                        
                        
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="food-item">
                        <h2>Todas as Cervejas</h2>
                        <img src="img/todascerv.png" alt="">
                        
                       
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="food-item">
                        <h2>Em Alta</h2>
                        <img src="img/emalta.png" alt="">
                        
                        
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="sign-up">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="heading">
                        <h2>Envie Sua sugestão</h2>
                    </div>
                </div>
            </div>
            <form id="contact" action="Contato" method="POST">
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <fieldset>
                            <p style="color: white; font-size: 2rem">Nome</p>
                            <input name="nome" type="text" class="form-control" id="nome" placeholder="Digite seu Nome" required>
                        </fieldset>
                    </div>
                    <div class="col-md-4 col-md-offset-4">
                        <fieldset>
                             <p style="color: white; font-size: 2rem">Email</p>
                            <input name="email" type="text" class="form-control" id="email" placeholder="Email" required>
                        </fieldset>
                    </div>
                    <div class="col-md-4 col-md-offset-4">
                        <fieldset>
                             <p style="color: white; font-size: 2rem">Mensagem</p>
                             <textarea class="form-control" cols="30" rows="5" name="mensagem">
                                </textarea>
        
                        </fieldset>
                        <p></p>
                        <fieldset>
                            <button type="submit" id="form-submit" class="btn">Enviar</button>
                        </fieldset>
                    </div>
                    
                        
                    
                </div>
            </form>
            <p style="color: white; font-size: 2rem">${msg} </p> 
                
                
                
        </div>
    </section>

    

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <a href="#">FAQ</a><br>
                   
                    
                </div>
                <div class="col-md-4">
                    <ul class="social-icons">
                        <li><a rel="nofollow" href="http://www.facebook.com/templatemo" target="_parent"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-rss"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                    </ul>
                </div>
                <div class="col-md-4">
                    <a href="">Sobre Nós</a>
                </div>
            </div>
        </div>
    </footer>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

    <script src="${pageContext.request.contextPath}/js/vendor/bootstrap.min.js"></script>

    <script src="${pageContext.request.contextPath}/js/plugins.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        // navigation click actions 
        $('.scroll-link').on('click', function(event){
            event.preventDefault();
            var sectionID = $(this).attr("data-id");
            scrollToID('#' + sectionID, 750);
        });
        // scroll to top action
        $('.scroll-top').on('click', function(event) {
            event.preventDefault();
            $('html, body').animate({scrollTop:0}, 'slow');         
        });
        // mobile nav toggle
        $('#nav-toggle').on('click', function (event) {
            event.preventDefault();
            $('#main-nav').toggleClass("open");
        });
    });
    // scroll function
    function scrollToID(id, speed){
        var offSet = 0;
        var targetOffset = $(id).offset().top - offSet;
        var mainNav = $('#main-nav');
        $('html,body').animate({scrollTop:targetOffset}, speed);
        if (mainNav.hasClass("open")) {
            mainNav.css("height", "1px").removeClass("in").addClass("collapse");
            mainNav.removeClass("open");
        }
    }
    if (typeof console === "undefined") {
        console = {
            log: function() { }
        };
    }
    </script>
    

      
</body>
</html>
