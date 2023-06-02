export interface Student {
    name: string;
    age: number;
    email: string;
    degree: "Associate" | "Bachelor" | "Master" | "Doctoral";
}

interface MytableProps {
    studentList: Student[];
}


export default function Mytable(props: MytableProps) {

    const studentRows = props.studentList.map( student => 
        <tr>
            <td>{student.name}</td>
            <td>{student.age}</td>
            <td>{student.email}</td>
            <td>{student.degree}</td>
        </tr>
    );

    return(
        <table>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>E-mail</th>
                <th>Degree</th>
            </tr>
            {studentRows}
        </table>
    );

}