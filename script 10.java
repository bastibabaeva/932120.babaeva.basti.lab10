document.addEventListener("DOMContentLoaded", function () {
    const curtain = document.querySelector(".curtain-img");

    let isCurtainClicked = false;

    curtain.addEventListener("mouseenter", function () {
        if (!isCurtainClicked) {
            curtain.style.transform = "translateY(-5%)";
        }
    });

    curtain.addEventListener("mouseleave", function () {
        if (!isCurtainClicked) {
            curtain.style.transform = "translateY(0)";
        }
    });

    curtain.addEventListener("click", function () {
        if (!isCurtainClicked) {
            isCurtainClicked = true;
            curtain.style.transition = "transform 1s ease-in-out";
            curtain.style.transform = "translateY(-100%)";
    });