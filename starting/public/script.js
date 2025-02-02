document.getElementById("attendanceForm").addEventListener("submit", function(event) {
    event.preventDefault();
    
    let name = document.getElementById("name").value;
    let date = document.getElementById("date").value;
    
    let table = document.getElementById("attendanceTable");
    let newRow = table.insertRow(-1);
    newRow.insertCell(0).innerText = name;
    newRow.insertCell(1).innerText = date;

    // Clear inputs
    document.getElementById("name").value = "";
    document.getElementById("date").value = "";
});
