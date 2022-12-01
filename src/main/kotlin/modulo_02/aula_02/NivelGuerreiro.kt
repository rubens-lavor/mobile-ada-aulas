package modulo_02.aula_02

// Exemplo: Enum
enum class NivelGuerreiro(val nome: String, val arma: ArmaGuerreiro) {
    SOLDADO(nome = "Soldado", arma = ArmaGuerreiro(nome = "Pistola", dano = 4)) {
        override fun superDano(): Int {
            return arma.dano * 1
        }
    },
    GUARDA(nome = "Guarda", arma = ArmaGuerreiro(nome = "Escopeta", dano = 10)) {
        override fun superDano(): Int {
            return arma.dano * 1
        }
    },
    GENERAL(nome = "General", arma = ArmaGuerreiro(nome = "Fuzil", dano = 14)) {
        override fun superDano(): Int {
            return arma.dano * 2
        }
    },
    CELESTIAL(nome = "Celestial", arma = ArmaGuerreiro(nome = "Espada Celestial", dano = 30)) {
        override fun superDano(): Int {
            return arma.dano * 4
        }
    },
    APOCALIPTICO(nome = "Apocalíptico", arma = ArmaGuerreiro(nome = "Machado das Trevas", dano = 65)) {
        override fun superDano(): Int {
            return arma.dano * 5
        }
    },
    DEUS_DOS_DEUSES(nome = "Deus dos Deuses", arma = ArmaGuerreiro(nome = "Bíblia Sagrada", dano = 150)) {
        override fun superDano(): Int {
            return arma.dano * 10
        }
    };

    override fun toString(): String {
        return "NivelGuerreiro(nome=$nome, arma=$arma)"
    }

    abstract fun superDano(): Int

}
