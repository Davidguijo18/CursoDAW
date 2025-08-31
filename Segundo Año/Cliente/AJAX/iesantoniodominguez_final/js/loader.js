document.addEventListener("DOMContentLoaded", function () {
    const inserts = {
        "header-placeholder": "header.html",
        "navbar-placeholder": "navbar.html",
        "footer-placeholder": "footer.html"
    };

    for (const [id, file] of Object.entries(inserts)) {
        const el = document.getElementById(id);
        if (el) {
            fetch(file)
                .then(res => res.text())
                .then(html => el.innerHTML = html);
        }
    }
});
