<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation-patient.jspf"%>

<div class="container-fluid">
<h2>Your profile</h2>
<table class="table table-reflow">

  <thead>
    <tr>
      <th>username</th>
   	<th>name</th>
   	<th>surname</th>
   	<th>gender</th>
   	<th>ssn</th>
   	<th>birthdate</th>
   	<th>address</th>
   	<th>tel</th>
   	<th>email</th>
   	<th>HospitalNumber</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>${username}</td>
      <td>${patient.name}</td>
      <td>${patient.surname}</td>
      <td>${patient.gender}</td>
      <td>${patient.ssn}</td>
      <td>${patient.birthdate}</td>
      <td>${patient.address}</td>
      <td>${patient.tel}</td>
      <td>${patient.email}</td>
      <td>${patient.hospitalNumber}</td>
    </tr>
  
  </tbody>
</table>
</div>

<%@ include file="common/footer.jspf"%>