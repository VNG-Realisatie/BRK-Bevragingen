# coding: utf-8

# flake8: noqa
"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

# import models into model package
from openapi_client.models.aantekening import Aantekening
from openapi_client.models.aantekening_all_of import AantekeningAllOf
from openapi_client.models.aantekening_basis import AantekeningBasis
from openapi_client.models.aantekening_tenaamstelling import AantekeningTenaamstelling
from openapi_client.models.aantekening_tenaamstelling_all_of import AantekeningTenaamstellingAllOf
from openapi_client.models.adres import Adres
from openapi_client.models.adres_uitgebreid import AdresUitgebreid
from openapi_client.models.adres_uitgebreid_all_of import AdresUitgebreidAllOf
from openapi_client.models.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.models.bad_request_foutbericht_all_of import BadRequestFoutberichtAllOf
from openapi_client.models.bedrag import Bedrag
from openapi_client.models.beslag import Beslag
from openapi_client.models.beslag_hal import BeslagHal
from openapi_client.models.beslag_hal_all_of import BeslagHalAllOf
from openapi_client.models.beslag_hal_collectie import BeslagHalCollectie
from openapi_client.models.beslag_hal_collectie_embedded import BeslagHalCollectieEmbedded
from openapi_client.models.beslag_links import BeslagLinks
from openapi_client.models.datum_onvolledig import DatumOnvolledig
from openapi_client.models.equivalentie_verklaarder import EquivalentieVerklaarder
from openapi_client.models.equivalentie_verklaarder_all_of import EquivalentieVerklaarderAllOf
from openapi_client.models.erfpacht_canon import ErfpachtCanon
from openapi_client.models.filiatie import Filiatie
from openapi_client.models.foutbericht import Foutbericht
from openapi_client.models.geboorte import Geboorte
from openapi_client.models.geslacht_enum import GeslachtEnum
from openapi_client.models.hal_collection_links import HalCollectionLinks
from openapi_client.models.hal_link import HalLink
from openapi_client.models.heeft_partnerschap import HeeftPartnerschap
from openapi_client.models.hypotheek import Hypotheek
from openapi_client.models.hypotheek_hal import HypotheekHal
from openapi_client.models.hypotheek_hal_all_of import HypotheekHalAllOf
from openapi_client.models.hypotheek_hal_collectie import HypotheekHalCollectie
from openapi_client.models.hypotheek_hal_collectie_embedded import HypotheekHalCollectieEmbedded
from openapi_client.models.hypotheek_links import HypotheekLinks
from openapi_client.models.invalid_params import InvalidParams
from openapi_client.models.kadaster_natuurlijk_persoon import KadasterNatuurlijkPersoon
from openapi_client.models.kadaster_natuurlijk_persoon_all_of import KadasterNatuurlijkPersoonAllOf
from openapi_client.models.kadaster_natuurlijk_persoon_hal import KadasterNatuurlijkPersoonHal
from openapi_client.models.kadaster_natuurlijk_persoon_hal_all_of import KadasterNatuurlijkPersoonHalAllOf
from openapi_client.models.kadaster_natuurlijk_persoon_hal_collectie import KadasterNatuurlijkPersoonHalCollectie
from openapi_client.models.kadaster_natuurlijk_persoon_hal_collectie_embedded import KadasterNatuurlijkPersoonHalCollectieEmbedded
from openapi_client.models.kadaster_niet_natuurlijk_persoon import KadasterNietNatuurlijkPersoon
from openapi_client.models.kadaster_niet_natuurlijk_persoon_all_of import KadasterNietNatuurlijkPersoonAllOf
from openapi_client.models.kadaster_niet_natuurlijk_persoon_hal import KadasterNietNatuurlijkPersoonHal
from openapi_client.models.kadaster_niet_natuurlijk_persoon_hal_collectie import KadasterNietNatuurlijkPersoonHalCollectie
from openapi_client.models.kadaster_niet_natuurlijk_persoon_hal_collectie_embedded import KadasterNietNatuurlijkPersoonHalCollectieEmbedded
from openapi_client.models.kadaster_persoon import KadasterPersoon
from openapi_client.models.kadaster_persoon_all_of import KadasterPersoonAllOf
from openapi_client.models.kadaster_persoon_links import KadasterPersoonLinks
from openapi_client.models.kadasterverzoek import Kadasterverzoek
from openapi_client.models.kadastraal_onroerende_zaak import KadastraalOnroerendeZaak
from openapi_client.models.kadastraal_onroerende_zaak_embedded import KadastraalOnroerendeZaakEmbedded
from openapi_client.models.kadastraal_onroerende_zaak_hal import KadastraalOnroerendeZaakHal
from openapi_client.models.kadastraal_onroerende_zaak_hal_all_of import KadastraalOnroerendeZaakHalAllOf
from openapi_client.models.kadastraal_onroerende_zaak_hal_collectie import KadastraalOnroerendeZaakHalCollectie
from openapi_client.models.kadastraal_onroerende_zaak_hal_collectie_embedded import KadastraalOnroerendeZaakHalCollectieEmbedded
from openapi_client.models.kadastraal_onroerende_zaak_links import KadastraalOnroerendeZaakLinks
from openapi_client.models.locatie_kadastraal_object import LocatieKadastraalObject
from openapi_client.models.locatie_kadastraal_object_all_of import LocatieKadastraalObjectAllOf
from openapi_client.models.naam import Naam
from openapi_client.models.naam_persoon import NaamPersoon
from openapi_client.models.naam_persoon_all_of import NaamPersoonAllOf
from openapi_client.models.natuurlijk_persoon_beperkt import NatuurlijkPersoonBeperkt
from openapi_client.models.natuurlijk_persoon_beperkt_all_of import NatuurlijkPersoonBeperktAllOf
from openapi_client.models.natuurlijk_persoon_type_enum import NatuurlijkPersoonTypeEnum
from openapi_client.models.niet_natuurlijk_persoon_beperkt import NietNatuurlijkPersoonBeperkt
from openapi_client.models.niet_natuurlijk_persoon_beperkt_all_of import NietNatuurlijkPersoonBeperktAllOf
from openapi_client.models.niet_natuurlijk_persoon_type_enum import NietNatuurlijkPersoonTypeEnum
from openapi_client.models.overlijden import Overlijden
from openapi_client.models.persoon_basis import PersoonBasis
from openapi_client.models.persoon_beperkt import PersoonBeperkt
from openapi_client.models.persoon_beperkt_all_of import PersoonBeperktAllOf
from openapi_client.models.persoon_type_enum import PersoonTypeEnum
from openapi_client.models.point_geo_json import PointGeoJSON
from openapi_client.models.polygon_geo_json import PolygonGeoJSON
from openapi_client.models.postadres import Postadres
from openapi_client.models.postadres_all_of import PostadresAllOf
from openapi_client.models.privaatrechtelijke_beperking_hal import PrivaatrechtelijkeBeperkingHal
from openapi_client.models.privaatrechtelijke_beperking_hal_all_of import PrivaatrechtelijkeBeperkingHalAllOf
from openapi_client.models.privaatrechtelijke_beperking_hal_collectie import PrivaatrechtelijkeBeperkingHalCollectie
from openapi_client.models.privaatrechtelijke_beperking_hal_collectie_embedded import PrivaatrechtelijkeBeperkingHalCollectieEmbedded
from openapi_client.models.privaatrechtelijke_beperking_links import PrivaatrechtelijkeBeperkingLinks
from openapi_client.models.publiekrechtelijke_beperking import PubliekrechtelijkeBeperking
from openapi_client.models.publiekrechtelijke_beperking_hal import PubliekrechtelijkeBeperkingHal
from openapi_client.models.publiekrechtelijke_beperking_hal_all_of import PubliekrechtelijkeBeperkingHalAllOf
from openapi_client.models.publiekrechtelijke_beperking_hal_collectie import PubliekrechtelijkeBeperkingHalCollectie
from openapi_client.models.publiekrechtelijke_beperking_hal_collectie_embedded import PubliekrechtelijkeBeperkingHalCollectieEmbedded
from openapi_client.models.publiekrechtelijke_beperking_links import PubliekrechtelijkeBeperkingLinks
from openapi_client.models.reden_verzoek import RedenVerzoek
from openapi_client.models.stuk import Stuk
from openapi_client.models.stuk_hal_basis import StukHalBasis
from openapi_client.models.stuk_hal_basis_all_of import StukHalBasisAllOf
from openapi_client.models.stuk_links import StukLinks
from openapi_client.models.stuk_type_enum import StukTypeEnum
from openapi_client.models.stukdeel import Stukdeel
from openapi_client.models.stukdeel_hal_basis import StukdeelHalBasis
from openapi_client.models.stukdeel_hal_basis_all_of import StukdeelHalBasisAllOf
from openapi_client.models.stukdeel_links import StukdeelLinks
from openapi_client.models.tenaamstelling import Tenaamstelling
from openapi_client.models.type_breuk import TypeBreuk
from openapi_client.models.type_gerechtigde_enum import TypeGerechtigdeEnum
from openapi_client.models.type_kadastraal_onroerende_zaak_enum import TypeKadastraalOnroerendeZaakEnum
from openapi_client.models.type_koopsom import TypeKoopsom
from openapi_client.models.type_oppervlak import TypeOppervlak
from openapi_client.models.type_perceelnummer_verschuiving import TypePerceelnummerVerschuiving
from openapi_client.models.waardelijst import Waardelijst
from openapi_client.models.zakelijk_gerechtigde import ZakelijkGerechtigde
from openapi_client.models.zakelijk_gerechtigde_hal import ZakelijkGerechtigdeHal
from openapi_client.models.zakelijk_gerechtigde_hal_all_of import ZakelijkGerechtigdeHalAllOf
from openapi_client.models.zakelijk_gerechtigde_hal_collectie import ZakelijkGerechtigdeHalCollectie
from openapi_client.models.zakelijk_gerechtigde_hal_collectie_embedded import ZakelijkGerechtigdeHalCollectieEmbedded
from openapi_client.models.zakelijk_gerechtigde_links import ZakelijkGerechtigdeLinks
