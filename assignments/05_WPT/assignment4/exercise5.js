// Exercise 5:
// Using fetchData from Exercise 4, create another function processData that
// simulates processing the fetched data. Chain these functions together using nested
// callbacks.
// Requirements:
// ● First, call fetchData. Once the response is received, pass it to processData.
// ● processData should modify the data and log the processed result.


function processData(arr) {
    arr = arr.map(e => e * 2);
    console.log(arr);
}

function fetchData(url, fun) {
    setTimeout(() => {
        if (!url) {
            fun("error");
        } else {
            var arr = fun(url);
            setTimeout(() => processData(arr), 1000);
        }
    }, 2000);
}

fetchData("www.google.com", (url) => {
    return [10, 20, 30];
});