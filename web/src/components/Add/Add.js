import {Button, TextField, Typography} from "material-ui";
import React, {Component} from "react";
import FirebaseService from "../../services/FirebaseService";
import {urls} from "../../utils/urlUtils";
import {withRouter} from "react-router-dom";

class Add extends Component {

    state = {id: null, CRM: '', nome: '', especialidades: ''};

    componentWillMount = () => {
        const {id} = this.props.match.params;

        if (!(id === undefined || !id)) {
            this.setState({id});
            FirebaseService.getUniqueDataBy('medico', id, (data) => this.setState({...data}, () => console.log(this.state)));
        }

    };

    submit = (event) => {
        event.preventDefault();

        const {CRM} = this.state;
        const {nome} = this.state;
        const {especialidades} = this.state;

        let objToSubmit = {
            CRM,
            nome,
            especialidades,
        };

        if (this.props.match.params.id === undefined) {
            FirebaseService.pushData('medico', objToSubmit);
        } else {
            FirebaseService.updateData(this.props.match.params.id, 'medico', objToSubmit)
        }

        this.props.history.push(urls.data.path);

    };

    handleChange = name => event => {
        this.setState({
            [name]: event.target.value,
        });
    };

    render = () => (<React.Fragment>

        <Typography variant="headline" component="h2">Dados do Médico</Typography>
        <form onSubmit={this.submit}>

            <TextField className="input-field"
                       type="text"
                       value={this.state.CRM}
                       label="CRM"
                       required
                       onChange={this.handleChange('CRM')}/>


            <TextField className="input-field"
                       type="text"
                       value={this.state.nome}
                       label="Nome"
                       required
                       onChange={this.handleChange('nome')}/>


            <TextField className="input-field"
                       type="text"
                       value={this.state.especialidades}
                       label="especialidades"
                       required
                       onChange={this.handleChange('especialidades')}/>

            <Button type="submit"
                    style={{marginTop: '20px', display: 'inline-block'}}>
                Salvar
            </Button>
        </form>
    </React.Fragment>)
}

export default withRouter(Add);