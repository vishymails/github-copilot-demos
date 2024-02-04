document.getElementById('chartTab').addEventListener('click', function() {

var ctx = document.getElementById('myChart').getContext('2d');


var income = [];
var expenses = [];

for (var i = 0; i < 12; i++) {
    var month = new Date(2000, i, 1).toLocaleString('default', { month: 'long' }).toLowerCase();
    income.push(document.getElementById(month + '-income').value);
    expenses.push(document.getElementById(month + '-expenses').value);
}

console.log(income); // Logs the income for each month
console.log(expenses); // Logs the expenses for each month


var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
        datasets: [{
            label: 'Income',
            data: income,
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
        },
        {
            label: 'Expenses',
            data: expenses,
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1
        }]
    },
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
});// This file is intentionally left blank

    // Your existing code here
});



document.getElementById('download').addEventListener('click', function() {
    var canvas = document.getElementById('myChart');
    var imgURL = canvas.toDataURL('image/png');
    var link = document.createElement('a');
    link.href = imgURL;
    link.download = 'chart.png';
    link.click();
});
//myChart.update(); // Updates the chart with the new data