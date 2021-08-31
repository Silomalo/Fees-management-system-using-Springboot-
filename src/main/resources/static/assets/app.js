
togglers=document.querySelector(".nav-toggle");
console.log(togglers);
links=document.querySelector(".links");
console.log(links);

togglers.addEventListener("click",function(){
    links.classList.toggle("show-links");
});

