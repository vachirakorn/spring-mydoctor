<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation-nurse.jspf"%>


<div class="container-fluid">

<a href="/view-info2" class="btn btn-success">Back to search</a>

<h2>Patient Personal Information</h2>

<table class="table table-condensed">
<thead>
		<tr>
			<th>Hospital Number </th>
			<th>Name </th>
			<th>Surname</th>
			<th>SSN</th>
			<th>Gender</th>
			<th>Birth Date</th>
			<th>Address</th>
			<th>Tel.</th>
			<th>Email</th>
			
		</tr>
	</thead>
   <tr>
       	<td>${patientInfo.hospitalNumber}</td>
       	<td>${patientInfo.name}</td>
       	<td>${patientInfo.surname}</td>
       	<td>${patientInfo.ssn}</td>
       	<td>${patientInfo.gender}</td>
       	<td>${patientInfo.birthdate}</td>
       	<td>${patientInfo.address}</td>
       	<td>${patientInfo.tel}</td>
       	<td>${patientInfo.email}</td>
       	
    </tr>

</table>



  <h2>Patient General Information</h2>

<table class="table table-condensed">
<thead>
		<tr>
			<th>Hospital Number </th>
			<th>Weight (kg) </th>
			<th>Height (m)</th>
			<th>Heart Rate (bpm)</th>
			<th>Systolic Blood Pressure (mmHg)</th>
			<th>Diastolic Blood Pressure (mmHg)</th>
			<th>Congemital</th>
			<th>Med Allergy</th>
			<th>Symptom</th>
			<th>Record Date</th>
		</tr>
	</thead>
   <tr>
       	<td>${generalInfo.hospitalNumber}</td>
       	<td>${generalInfo.weight}</td>
       	<td>${generalInfo.height}</td>
       	<td>${generalInfo.heart_rate}</td>
       	<td>${generalInfo.pressureH}</td>
       	<td>${generalInfo.pressureL}</td>
       	<td>${generalInfo.congemital}</td>
       	<td>${generalInfo.med_allergy}</td>
       	<td>${generalInfo.symptom}</td>
       	<td>${generalInfo.date}</td>
    </tr>

</table>

</div>


<%@ include file="common/footer.jspf"%>