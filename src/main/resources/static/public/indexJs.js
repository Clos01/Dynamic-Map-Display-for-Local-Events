document.addEventListener("DOMContentLoaded", function() {
    loadHTMLComponent("header", ".Components.header.html");
});

function loadHTMLComponent(placeholderId, path) {
    fetch(path).then(response => response.text()).then(data => {
        document.getElementById(placeholderId).innerHTML = data;
    });
}
