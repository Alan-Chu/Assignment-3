/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*****************check the form of inserting score*******************/ 
function checkInsert() {
    var insert_student_name = document.getElementById('insert_student_name').value;
    var insert_student_score = document.getElementById('insert_student_score').value;
    if (insert_student_name==null || insert_student_name=='') {
        alert('student name cannot be empty.')
        return false;
    }
    if (insert_student_score==null || insert_student_score=='') {
        alert('student score cannot be empty.')
        return false;
    }
    if (isNaN(parseFloat(insert_student_score))) {
        alert('invalid score.')
        return false;
    }
    return true;
}

/*****************check the form of checking score*******************/ 
function checkSelect() {
    var select_student_name = document.getElementById('select_student_name').value;
    if (select_student_name==null || select_student_name=='') {
        alert('student name cannot be empty.')
        return false;
    }
    return true;
}

/*****************check the form of updating score*******************/ 
function checkUpdate() {
    var update_student_name = document.getElementById('update_student_name').value;
    var update_student_score = document.getElementById('update_student_score').value;
    if (update_student_name==null || update_student_name=='') {
        alert('student name cannot be empty.')
        return false;
    }
    if (update_student_score==null || update_student_score=='') {
        alert('student score cannot be empty.')
        return false;
    }
    if (isNaN(parseFloat(update_student_score))) {
        alert('invalid score.')
        return false;
    }
    return true;
}

/******************clear input after clicking submitting button*****************/
function clearInput(button) {
    if (button.value == 'Insert') {
        document.getElementById('insert_student_name').value = '';
        document.getElementById('insert_student_score').value = '';
    }
    else if (button.value == 'Select') {
        document.getElementById('select_student_name').value = '';
    }
    else if (button.value == 'Update') {
        document.getElementById('update_student_name').value = '';
        document.getElementById('update_student_score').value = '';
    }
}