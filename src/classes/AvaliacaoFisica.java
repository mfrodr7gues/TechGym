package classes;

import java.util.Date;

public class AvaliacaoFisica {
    
    // Atributos
    private int idAvaliacaoFisica;
    private Date dataAvaliacaoFisica;
    private float peso;
    private float altura;
    private float percentualGordura;
    private float massaMuscular;

    // Construtor
    public AvaliacaoFisica (int idAvaliacaoFisica, Date dataAvaliacaoFisica, float peso, float altura, float percentualGordura, float massaMuscular) {
        this.idAvaliacaoFisica = idAvaliacaoFisica;
        this.dataAvaliacaoFisica = dataAvaliacaoFisica;
        this.peso = peso;
        this.altura = altura;
        this.percentualGordura = percentualGordura;
        this.massaMuscular = massaMuscular;
    }

    // Acesso às privates usando getters e setters
    public int getIdAvaliacaoFisica() { 
        return idAvaliacaoFisica; 
    }
    
    public void setIdAvaliacaoFisica(int idAvaliacaoFisica) { 
        this.idAvaliacaoFisica = idAvaliacaoFisica; 
    }

    public Date getDataAvaliacaoFisica() { 
        return dataAvaliacaoFisica; 
    }

    public void setDataAvaliacaoFisica(Date dataAvaliacaoFisica) { 
        this.dataAvaliacaoFisica = dataAvaliacaoFisica; 
    }

    public float getPeso() { 
        return peso; 
    }

    public void setPeso(float peso) { 
        this.peso = peso; 
    }

    public float getAltura() { 
        return altura; 
    }

    public void setAltura(float altura) { 
        this.altura = altura; 
    }

    public float getPercentualGordura() { 
        return percentualGordura; 
    }

    public void setPercentualGordura(float percentualGordura) { 
        this.percentualGordura = percentualGordura; 
    }

    public float getMassaMuscular() { 
        return massaMuscular; 
    }

    public void setMassaMuscular(float massaMuscular) { 
        this.massaMuscular = massaMuscular; 
    }
}
