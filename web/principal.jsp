<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html
<meta charset="UTF-8">
<html lang="en">
 <link rel="stylesheet" href="./css/princ.css"/>


<body>
  
    <div>
        <nav>
            <a href="#">
                <img src="./imagenes/serpLogo.JPG" alt="Logo " />
            </a>

            <div style="margin-top: 15px;">
                
               <ul class="menu">
    <li><a href="index.jsp">Inicio </a></li>
   

  </ul>
            </div>

        </nav>
    
        <header id="tituloIndex">
           <header>
  <input id="buscar" type="search" placeholder="Buscar...">
</header>
        </header>
       
            
    <div class="carousel">
<div class="slide">
<img src="./imagenes/serp1.JPG" alt="">

</div>   
   
<div class="slide">
      
<img src="./imagenes/serp2.JPG" alt="">
    
</div>
    
<div class="slide">
      
<img src="./imagenes/serp3.JPG" alt="">
    </div>
    
  </div>
  <script>
    function cambiarImagen() {
      var slides = document.getElementsByClassName('slide');
      var currentSlide = 0;
      
      setInterval(function() {
        slides[currentSlide].classList.remove('active');
        currentSlide = (currentSlide + 1) % slides.length;
        slides[currentSlide].classList.add('active');
      }, 2000); 
    }
    
    cambiarImagen();
  </script>
  
          <div class="text-frame">
      <center> <h5> ¿QUIENES SOMOS?</h5></center>
   
     Somos un equipo que ofrece un sistema experto de test vocacional,  comprometidos en brindar soluciones innovadoras 
     para ayudar a las personas a tomar decisiones informadas sobre su futuro profesional.
     Nuestro sistema ayuda a comprender  a fondo las necesidades y aspiraciones individualesbr
      de nuestros usuarios y brindarles un entorno seguro y confiable para explorar sus intereses y habilidades.</center>
 
 
</div>
   
  <aside>
      <div class="text-frame">
          <center> <h5> MISIÓN</h5></center>
   
     <p>Nuestra mision es proporcionar un sistema experto<BR>
         
       de test vocacionalpreciso y personalizado que guie <BR>
       a los individuos en la exploracion de sus intereses ,<BR>
        habilidades y valores que les brinde recomendaciones<BR> 
        profesionales  solidas y realistas. 
                            </p>
  
 
</div>
 
  <div class="text-frame">
    <center> <h5>VISIÓN</h5></center>
   <p>Ser el sistema experto lider y de confianza en el<BR>
      campo de la orientacion vocacional,<BR> 
      ayudando a las personas a descubrir y <BR> 
      aprovechar  su maximo potencial peofesional.</p>
                         

</div>
  
         
<div class="text-frame">
   <center> <h5>NUESTROS OBJETIVOS</h5></center>
   <P>El objetivo de este proyecto es desarrollar y <BR>
      ofrecer un sistema experto de prueba vocacional<BR>
     que ayude a las personas a tomar decisiones <BR>
     informadas sobre su futuro profesional.<BR>
     El sistema tiene como objetivo principal<BR> 
     comprender a fondo las necesidades y aspiraciones<BR>
     individuales de los usuarios, brindándoles<BR>
     un entorno seguro y confiable para explorar <BR>
     sus intereses y habilidades.</P>
      
  
  </div>
       </aside>
 

      

   


<center><h3>NUESTRO EQUIPO</h3></center>
       <div class="image-frame">
    <figure>
                <img src="./imagenes/fo1.JPG" alt="">
                <figcaption>
                    
                    <center><h5>Diego Achulla</h5></center>
                  
                </figcaption>
                
            </figure>
                    <figure>
                <img src="./imagenes/fo2.JPG" alt="">
                <figcaption>
                    
                    <center><h5>Angel Martinez</h5></center>
                  
                </figcaption>
                
            </figure>
                    
                
    <figure>
                <img src="./imagenes/fo4.JPG" alt="">
                <figcaption>
                   <center><h5>Carlos Huicho</h5></center>
                </figcaption>
                
            </figure>
           <figure>
                <img src="./imagenes/fo5.JPG" alt="">
                <figcaption>
                    
                    <center><h5>Jheremi Toledo</h5></center>
                  
                </figcaption>
                
            </figure>
                    
           <figure>
                <img src="./imagenes/fo3.JPG" alt="">
                <figcaption>
                  <center><h5>Lea Orosco</h5></center>
                </figcaption>
                
            </figure>
         
            
  </div>
                                   
    
        
    <div>
        <footer>

            <center>
                <figure>
                    <a href="www.youtube.com" target="_blank"><img src="./imagenes/facebook1.png" alt=""></a>
                    <a href="www.instagram.com"><img src="./imagenes/instagram1.png" alt=""></a>
                    <a href="www.whatsapp.com"><img src="./imagenes/whatsapp1.png" alt=""></a>
                    <figcaption>
                        <strong>Nuestras redes</strong>
                    </figcaption>
                </figure>

            </center>

        </footer>



    </div>



</body>



</html>

