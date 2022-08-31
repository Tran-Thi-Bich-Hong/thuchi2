/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

/* global fetch, moment */

function loadEarning(endpoint) {
    fetch(endpoint).then(function(res) {
        return res.json();
    }).then(function(data) {
        let msg = "";
//        for (let i = 0; i < data.length; i++) {
       var stt = 0;
        for (let i = 0; i < data.length; i++) {
            stt = stt + 1;
            msg += `
            <tr>
                <td>${stt}</td>
                <td> ${moment(data[i].createddate).format("DD/MM/YYYY")}</td>
                <td>${data[i].totalMoney.toLocaleString('en-US')}</td>
                <td>${data[i].typeEarningId.name}</td>
                <td>${data[i].note}</td>
      
            </tr>
           
            `;
         
        }
        let d = document.getElementById("tbEarnings");
        d.innerHTML = msg;
        
        
       
        
//        let d2 = document.getElementById("myLoading");
//        d2.style.display = "none";
    });
}


