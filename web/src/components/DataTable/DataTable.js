import React from 'react';
import {Button, Table, TableBody, TableCell, TableHead, TableRow, Typography} from "material-ui";
import FirebaseService from "../../services/FirebaseService";

export const DataTable = ({data}) => {
    const remove = (id) => {
        FirebaseService.remove(id, 'medico');
    };

    return <React.Fragment>
        <Typography variant="headline" component="h2">Médicos</Typography>
        <Table selectable={false}>
            <TableHead>
                <TableRow>
                    <TableCell>CRM</TableCell>
                    <TableCell>Nome</TableCell>
                    <TableCell>Especialidades</TableCell>
                </TableRow>
            </TableHead>
            <TableBody>
                {
                    data.map((item, index) =>
                        <TableRow key={index}>
                            <TableCell>{item.medico}</TableCell>
                            <TableCell>{item.CRM}</TableCell>
                            <TableCell>{item.nome}</TableCell>
                            <TableCell>{item.especialidades}</TableCell>
                            <TableCell>
                                <Button
                                   onClick={() => remove(item.key)}>
                                    Remove
                                </Button>
                            </TableCell>
                        </TableRow>
                    )
                }
            </TableBody>
        </Table>
    </React.Fragment>
};