var getHeader = document.querySelector(".navSecond");
let lastScroll=0;

window.addEventListener("scroll", function(){
    let scrollY=this.scrollY;
    if(scrollY > lastScroll){
        getHeader.classList.add("navScroll");
    }else if(scrollY < lastScroll){
        getHeader.classList.remove("navScroll");
    }
    lastScroll=scrollY;
})