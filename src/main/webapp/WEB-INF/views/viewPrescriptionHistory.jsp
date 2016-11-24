<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation-pharmacist.jspf"%>

<div class="container-fluid">

<table class="table">
<thead style="background:#FBB917 !important">
		<tr>
			<th>ID </th>
			<th>PrescriptionID </th>
			<th>Instruction</th>
			<th>Medicine</th>
			<th>Dose</th>
		</tr>
	</thead>
<c:forEach items="${prescriptionHistorys}" var="prescriptionHistory">
   <tr>
       <td>${prescriptionHistory.userid}</td>
       <td>${prescriptionHistory.prescriptionId}</td>
       <td>${prescriptionHistory.instruction}</td>
       <td>${prescriptionHistory.medicinename}</td>
       <td>${prescriptionHistory.amount}</td>
    </tr>
</c:forEach>

</table>
</div>



<%@ include file="common/footer.jspf"%>
