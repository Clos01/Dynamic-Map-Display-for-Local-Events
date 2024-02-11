// const { createElement } = require("react");

const searchForm = document.getElementById('searchForm');
const searchTermInput = document.getElementById('searchInput');
const searchResult = document.getElementById('searchResult');

searchForm.addEventListener('submit', function (event) {
    event.preventDefault(); // prevents from reloading the whole page 
    //Extracts Value from input (variable searchTerm)
    const searchTerm = searchTermInput.value.trim(); //.trim() removes any extra spaces before and after the entered text
    
    //making error div to display if there is no search term found 
    const errorDiv = document.createElement("div");

// Setting the content of the error div
newDiv.textContent = "This is a new div element";
if(!searchTerm){
     errorDiv.textContent = "No search term was entered. Please enter a search term.";

        // Append the new div to the body
// document.body.appendChild(errorDiv);
}
//have to prepare the xhr which in js means to create htpp requests but new modern use fetch()
fetch(`/api/restaurants/search?name=${encodeURIComponent(searchTerm)}`)
.then(data =>{
    return data.json();
})
.then(post => {
    console.log();
});







}) 