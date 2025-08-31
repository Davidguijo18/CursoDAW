document.addEventListener('DOMContentLoaded', function () {
    document.body.classList.add('loaded');

    // Lazy loading con IntersectionObserver
    if ('IntersectionObserver' in window) {
        const lazyImages = document.querySelectorAll('img[loading="lazy"]');
        const observer = new IntersectionObserver(entries => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    const img = entry.target;
                    img.src = img.dataset.src || img.src;
                    observer.unobserve(img);
                }
            });
        });
        lazyImages.forEach(img => observer.observe(img));
    }

    // Scroll suave para anclas
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            const target = document.querySelector(this.getAttribute('href'));
            if (target) {
                e.preventDefault();
                target.scrollIntoView({ behavior: 'smooth' });
            }
        });
    });

    // Efecto de sombra en navbar al hacer scroll
    const navbar = document.querySelector('.navbar');
    window.addEventListener('scroll', () => {
        if (window.scrollY > 10) {
            navbar.classList.add('shadow-sm');
        } else {
            navbar.classList.remove('shadow-sm');
        }
    });

    // Animación de aparición (fadeIn) al hacer scroll
    const faders = document.querySelectorAll('.fade-in');
    const fadeObserver = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('show');
                observer.unobserve(entry.target);
            }
        });
    }, { threshold: 0.2 });

    faders.forEach(el => fadeObserver.observe(el));

    // Animación suave para dropdowns (Bootstrap)
    const dropdowns = document.querySelectorAll('.dropdown');
    dropdowns.forEach(drop => {
        drop.addEventListener('show.bs.dropdown', () => {
            const menu = drop.querySelector('.dropdown-menu');
            menu.classList.add('animate__animated', 'animate__fadeIn');
        });
        drop.addEventListener('hide.bs.dropdown', () => {
            const menu = drop.querySelector('.dropdown-menu');
            menu.classList.remove('animate__fadeIn');
        });
    });

    // Activar ScrollSpy si tienes secciones con id
    const body = document.body;
    if (document.querySelector('[data-bs-spy="scroll"]')) {
        bootstrap.ScrollSpy.getInstance(body)?.dispose();
        new bootstrap.ScrollSpy(body, {
            target: '#navbarNav',
            offset: 80
        });
    }
});
