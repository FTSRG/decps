<div>
    <form action="index.php?index=add_app_type" method="post" enctype="multipart/form-data">
        
        <table>
            <tr>
                <td>Name</td>
                <td><input name="name" type="text" /></td>
            </tr>
            <tr>
                <td>EXE File Url</td>
                <td><input name="exeFileUrl" type="text" /></td>
            </tr>
            <tr>
                <td>EXE File Type</td>
                <td><input name="exeFileType" type="text" /></td>
            </tr>
            <tr>
                <td>ZIP File Url</td>
                <!-- <td><input name="upfile" type="file" /></td> -->
                <td><input name="zipFileUrl" type="text" /></td>
            </tr>
        </table>
        
        <input type="submit" value="Create Application Type">
    </form> 
</div>
