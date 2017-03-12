package br.com.alura.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.alura.agenda.modelo.Aluno;

import static br.com.alura.agenda.R.*;

/**
 * Created by MARIOSUPERHELP on 11/03/2017.
 */

public class FormularioHelper {

    private Aluno aluno;

    private EditText campoNome;
    private EditText campoEndereco;
    private EditText campoTelefone;
    private EditText campoSite;
    private RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(id.formulario_endereco);
        campoTelefone = (EditText) activity.findViewById(id.formulario_telefone);
        campoSite = (EditText) activity.findViewById(id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(id.formulario_nota);
        aluno = new Aluno();
    }

    public Aluno pegaAluno() {
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return  aluno;
    }

    public void preencheFormulario(Aluno aluno) {
        campoNome.setText(aluno.getNome());
        campoEndereco.setText(aluno.getEndereco());
        campoTelefone.setText(aluno.getTelefone());
        campoSite.setText(aluno.getSite());
        campoNota.setProgress(aluno.getNota().intValue());
        this.aluno = aluno;
    }
}
