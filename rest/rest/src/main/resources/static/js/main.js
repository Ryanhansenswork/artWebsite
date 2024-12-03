//change active nav
const activelink = window.location.pathname;
const navLinks = document.querySelectorAll('ul a').forEach(link =>{
    if(link.href.includes(`${activelink}`)){
      link.classList.add('nav-links')
    }
})