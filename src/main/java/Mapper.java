import com.mcserby.training.refactoring.Details;
import com.mcserby.training.refactoring.InternationalValues;
import com.mcserby.training.refactoring.Locale;
import com.mcserby.training.refactoring.Translation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    private static Translation getNamesFromInternationalValues(List<InternationalValues> iv, String getter, String locale) {
        String names = "";
        try {
            Class<?> c = Class.forName("InternationalValues");
            Method getMethod = c.getDeclaredMethod(getter, null);
            List<Details> details = iv.stream().map(elem -> {
                try {
                    return (Details) getMethod.invoke(elem, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return new Details();
            }).collect(Collectors.toList());
            names = details.stream().map(Details::getName).distinct().collect(Collectors.joining(""));
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return new Translation(Collections.singletonList(names), new Locale(locale));
    }

    private static List<Translation> mapNamesV2(List<InternationalValues> values) {
        return Arrays.asList(
            getNamesFromInternationalValues(values, "getUk", "en_uk"),
            getNamesFromInternationalValues(values, "getNL", "nl"),
            getNamesFromInternationalValues(values, "getDe", "de"),
            getNamesFromInternationalValues(values, "getFr", "fr"),
            getNamesFromInternationalValues(values, "getEs", ""),
            getNamesFromInternationalValues(values, "getIt", "it"),
            getNamesFromInternationalValues(values, "getAt", "at"),
            getNamesFromInternationalValues(values, "getChFr", "ch_fr"),
            getNamesFromInternationalValues(values, "getChDe", "ch_de"),
            getNamesFromInternationalValues(values, "getChDe", "ch_de"),
            getNamesFromInternationalValues(values,"getChIt","ch_it"),
            getNamesFromInternationalValues(values,"getBeFr","be_fr"),
            getNamesFromInternationalValues(values,"getLuDe","lux_de"),
            getNamesFromInternationalValues(values,"getCaEs","es_ca"),
            getNamesFromInternationalValues(values,"getLuFr","lux_fr"));
    }

    private static List<Translation> mapNames(List<InternationalValues> values) {
        String name = values.stream().map(iv -> iv.getUk().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfUk = new Translation(Collections.singletonList(name), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getNl().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getDe().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getFr().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getEs().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getIt().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getAt().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getChFr().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getChDe().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getChIt().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getBeFr().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getLuDe().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getCaEs().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getLuFr().getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }

    private static List<Translation> mapDescriptions(List<InternationalValues> values) {
        String description = values.stream().map(iv -> iv.getUk().getDescription()).findFirst().orElse("");
        Translation psfUk = new Translation(Collections.singletonList(description), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getNl().getDescription().substring(0, Math.min(iv.getNl().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getDe().getDescription().substring(0, Math.min(iv.getDe().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getFr().getDescription().substring(0, Math.min(iv.getFr().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getEs().getDescription().substring(0, Math.min(iv.getEs().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getIt().getDescription().substring(0, Math.min(iv.getIt().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getAt().getDescription().substring(0, Math.min(iv.getAt().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getChFr().getDescription().substring(0, Math.min(iv.getChFr().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getChDe().getDescription().substring(0, Math.min(iv.getChDe().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getChIt().getDescription().substring(0, Math.min(iv.getChIt().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getBeFr().getDescription().substring(0, Math.min(iv.getBeFr().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getLuDe().getDescription().substring(0, Math.min(iv.getLuDe().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getCaEs().getDescription().substring(0, Math.min(iv.getCaEs().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getLuFr().getDescription().substring(0, Math.min(iv.getLuFr().getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }
}
