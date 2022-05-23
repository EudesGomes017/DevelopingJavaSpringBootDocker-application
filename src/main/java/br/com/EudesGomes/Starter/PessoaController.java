package br.com.EudesGomes.Starter;

import br.com.EudesGomes.Starter.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
/*retorna os objetos implementamos os getrs e seters, setamos os valores nele e retornamos o proprio objeto e ele retornou na web*/
    @RequestMapping(value="/nome-completo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) //definimos os serviços
    public Pessoa getNomePessoa() {
        var pessoa = new Pessoa(); /*o var veio no java, por isso não foi feito Pessoa pessoa = new Pessoa()*/
        pessoa.setNome("Eudes ");
        pessoa.setSobrenome("Gomes");
        return pessoa;
    }
}
