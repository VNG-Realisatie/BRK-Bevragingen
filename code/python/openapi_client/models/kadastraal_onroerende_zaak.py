# coding: utf-8

"""
    Kadastraal onroerende zaken

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class KadastraalOnroerendeZaak(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'identificatie': 'str',
        'domein': 'str',
        'begrenzing_perceel': 'PolygonGeoJSON',
        'perceelnummer_rotatie': 'float',
        'plaatscoordinaten': 'PointGeoJSON',
        'koopsom': 'TypeKoopsom',
        'toelichting_bewaarder': 'str',
        'type': 'TypeKadastraalOnroerendeZaakEnum',
        'aard_cultuur_bebouwd': 'Waardelijst',
        'aard_cultuur_onbebouwd': 'Waardelijst',
        'kadastrale_aanduiding': 'str',
        'kadastrale_grootte': 'TypeOppervlak',
        'perceelnummer_verschuiving': 'TypePerceelnummerVerschuiving',
        'adressen': 'list[LocatieKadastraalObject]',
        'zakelijk_gerechtigde_identificaties': 'list[str]'
    }

    attribute_map = {
        'identificatie': 'identificatie',
        'domein': 'domein',
        'begrenzing_perceel': 'begrenzingPerceel',
        'perceelnummer_rotatie': 'perceelnummerRotatie',
        'plaatscoordinaten': 'plaatscoordinaten',
        'koopsom': 'koopsom',
        'toelichting_bewaarder': 'toelichtingBewaarder',
        'type': 'type',
        'aard_cultuur_bebouwd': 'aardCultuurBebouwd',
        'aard_cultuur_onbebouwd': 'aardCultuurOnbebouwd',
        'kadastrale_aanduiding': 'kadastraleAanduiding',
        'kadastrale_grootte': 'kadastraleGrootte',
        'perceelnummer_verschuiving': 'perceelnummerVerschuiving',
        'adressen': 'adressen',
        'zakelijk_gerechtigde_identificaties': 'zakelijkGerechtigdeIdentificaties'
    }

    def __init__(self, identificatie=None, domein=None, begrenzing_perceel=None, perceelnummer_rotatie=None, plaatscoordinaten=None, koopsom=None, toelichting_bewaarder=None, type=None, aard_cultuur_bebouwd=None, aard_cultuur_onbebouwd=None, kadastrale_aanduiding=None, kadastrale_grootte=None, perceelnummer_verschuiving=None, adressen=None, zakelijk_gerechtigde_identificaties=None, local_vars_configuration=None):  # noqa: E501
        """KadastraalOnroerendeZaak - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identificatie = None
        self._domein = None
        self._begrenzing_perceel = None
        self._perceelnummer_rotatie = None
        self._plaatscoordinaten = None
        self._koopsom = None
        self._toelichting_bewaarder = None
        self._type = None
        self._aard_cultuur_bebouwd = None
        self._aard_cultuur_onbebouwd = None
        self._kadastrale_aanduiding = None
        self._kadastrale_grootte = None
        self._perceelnummer_verschuiving = None
        self._adressen = None
        self._zakelijk_gerechtigde_identificaties = None
        self.discriminator = None

        if identificatie is not None:
            self.identificatie = identificatie
        if domein is not None:
            self.domein = domein
        if begrenzing_perceel is not None:
            self.begrenzing_perceel = begrenzing_perceel
        if perceelnummer_rotatie is not None:
            self.perceelnummer_rotatie = perceelnummer_rotatie
        if plaatscoordinaten is not None:
            self.plaatscoordinaten = plaatscoordinaten
        if koopsom is not None:
            self.koopsom = koopsom
        if toelichting_bewaarder is not None:
            self.toelichting_bewaarder = toelichting_bewaarder
        if type is not None:
            self.type = type
        if aard_cultuur_bebouwd is not None:
            self.aard_cultuur_bebouwd = aard_cultuur_bebouwd
        if aard_cultuur_onbebouwd is not None:
            self.aard_cultuur_onbebouwd = aard_cultuur_onbebouwd
        if kadastrale_aanduiding is not None:
            self.kadastrale_aanduiding = kadastrale_aanduiding
        if kadastrale_grootte is not None:
            self.kadastrale_grootte = kadastrale_grootte
        if perceelnummer_verschuiving is not None:
            self.perceelnummer_verschuiving = perceelnummer_verschuiving
        if adressen is not None:
            self.adressen = adressen
        if zakelijk_gerechtigde_identificaties is not None:
            self.zakelijk_gerechtigde_identificaties = zakelijk_gerechtigde_identificaties

    @property
    def identificatie(self):
        """Gets the identificatie of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The identificatie of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: str
        """
        return self._identificatie

    @identificatie.setter
    def identificatie(self, identificatie):
        """Sets the identificatie of this KadastraalOnroerendeZaak.


        :param identificatie: The identificatie of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: str
        """

        self._identificatie = identificatie

    @property
    def domein(self):
        """Gets the domein of this KadastraalOnroerendeZaak.  # noqa: E501

        Het domein waartoe de identificatie behoort.  # noqa: E501

        :return: The domein of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: str
        """
        return self._domein

    @domein.setter
    def domein(self, domein):
        """Sets the domein of this KadastraalOnroerendeZaak.

        Het domein waartoe de identificatie behoort.  # noqa: E501

        :param domein: The domein of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: str
        """

        self._domein = domein

    @property
    def begrenzing_perceel(self):
        """Gets the begrenzing_perceel of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The begrenzing_perceel of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: PolygonGeoJSON
        """
        return self._begrenzing_perceel

    @begrenzing_perceel.setter
    def begrenzing_perceel(self, begrenzing_perceel):
        """Sets the begrenzing_perceel of this KadastraalOnroerendeZaak.


        :param begrenzing_perceel: The begrenzing_perceel of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: PolygonGeoJSON
        """

        self._begrenzing_perceel = begrenzing_perceel

    @property
    def perceelnummer_rotatie(self):
        """Gets the perceelnummer_rotatie of this KadastraalOnroerendeZaak.  # noqa: E501

        Rotatie van het perceelnummer ten behoeve van visualisatie op de kaart. Perceelnummers worden bijvoorbeeld gekanteld om in een smal perceel te passen.  # noqa: E501

        :return: The perceelnummer_rotatie of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: float
        """
        return self._perceelnummer_rotatie

    @perceelnummer_rotatie.setter
    def perceelnummer_rotatie(self, perceelnummer_rotatie):
        """Sets the perceelnummer_rotatie of this KadastraalOnroerendeZaak.

        Rotatie van het perceelnummer ten behoeve van visualisatie op de kaart. Perceelnummers worden bijvoorbeeld gekanteld om in een smal perceel te passen.  # noqa: E501

        :param perceelnummer_rotatie: The perceelnummer_rotatie of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: float
        """
        if (self.local_vars_configuration.client_side_validation and
                perceelnummer_rotatie is not None and perceelnummer_rotatie > 999):  # noqa: E501
            raise ValueError("Invalid value for `perceelnummer_rotatie`, must be a value less than or equal to `999`")  # noqa: E501

        self._perceelnummer_rotatie = perceelnummer_rotatie

    @property
    def plaatscoordinaten(self):
        """Gets the plaatscoordinaten of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The plaatscoordinaten of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: PointGeoJSON
        """
        return self._plaatscoordinaten

    @plaatscoordinaten.setter
    def plaatscoordinaten(self, plaatscoordinaten):
        """Sets the plaatscoordinaten of this KadastraalOnroerendeZaak.


        :param plaatscoordinaten: The plaatscoordinaten of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: PointGeoJSON
        """

        self._plaatscoordinaten = plaatscoordinaten

    @property
    def koopsom(self):
        """Gets the koopsom of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The koopsom of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: TypeKoopsom
        """
        return self._koopsom

    @koopsom.setter
    def koopsom(self, koopsom):
        """Sets the koopsom of this KadastraalOnroerendeZaak.


        :param koopsom: The koopsom of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: TypeKoopsom
        """

        self._koopsom = koopsom

    @property
    def toelichting_bewaarder(self):
        """Gets the toelichting_bewaarder of this KadastraalOnroerendeZaak.  # noqa: E501

        Toelichtende tekst bij een onroerende zaak van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.  # noqa: E501

        :return: The toelichting_bewaarder of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: str
        """
        return self._toelichting_bewaarder

    @toelichting_bewaarder.setter
    def toelichting_bewaarder(self, toelichting_bewaarder):
        """Sets the toelichting_bewaarder of this KadastraalOnroerendeZaak.

        Toelichtende tekst bij een onroerende zaak van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.  # noqa: E501

        :param toelichting_bewaarder: The toelichting_bewaarder of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: str
        """

        self._toelichting_bewaarder = toelichting_bewaarder

    @property
    def type(self):
        """Gets the type of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The type of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: TypeKadastraalOnroerendeZaakEnum
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this KadastraalOnroerendeZaak.


        :param type: The type of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: TypeKadastraalOnroerendeZaakEnum
        """

        self._type = type

    @property
    def aard_cultuur_bebouwd(self):
        """Gets the aard_cultuur_bebouwd of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The aard_cultuur_bebouwd of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._aard_cultuur_bebouwd

    @aard_cultuur_bebouwd.setter
    def aard_cultuur_bebouwd(self, aard_cultuur_bebouwd):
        """Sets the aard_cultuur_bebouwd of this KadastraalOnroerendeZaak.


        :param aard_cultuur_bebouwd: The aard_cultuur_bebouwd of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: Waardelijst
        """

        self._aard_cultuur_bebouwd = aard_cultuur_bebouwd

    @property
    def aard_cultuur_onbebouwd(self):
        """Gets the aard_cultuur_onbebouwd of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The aard_cultuur_onbebouwd of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._aard_cultuur_onbebouwd

    @aard_cultuur_onbebouwd.setter
    def aard_cultuur_onbebouwd(self, aard_cultuur_onbebouwd):
        """Sets the aard_cultuur_onbebouwd of this KadastraalOnroerendeZaak.


        :param aard_cultuur_onbebouwd: The aard_cultuur_onbebouwd of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: Waardelijst
        """

        self._aard_cultuur_onbebouwd = aard_cultuur_onbebouwd

    @property
    def kadastrale_aanduiding(self):
        """Gets the kadastrale_aanduiding of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The kadastrale_aanduiding of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: str
        """
        return self._kadastrale_aanduiding

    @kadastrale_aanduiding.setter
    def kadastrale_aanduiding(self, kadastrale_aanduiding):
        """Sets the kadastrale_aanduiding of this KadastraalOnroerendeZaak.


        :param kadastrale_aanduiding: The kadastrale_aanduiding of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: str
        """

        self._kadastrale_aanduiding = kadastrale_aanduiding

    @property
    def kadastrale_grootte(self):
        """Gets the kadastrale_grootte of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The kadastrale_grootte of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: TypeOppervlak
        """
        return self._kadastrale_grootte

    @kadastrale_grootte.setter
    def kadastrale_grootte(self, kadastrale_grootte):
        """Sets the kadastrale_grootte of this KadastraalOnroerendeZaak.


        :param kadastrale_grootte: The kadastrale_grootte of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: TypeOppervlak
        """

        self._kadastrale_grootte = kadastrale_grootte

    @property
    def perceelnummer_verschuiving(self):
        """Gets the perceelnummer_verschuiving of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The perceelnummer_verschuiving of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: TypePerceelnummerVerschuiving
        """
        return self._perceelnummer_verschuiving

    @perceelnummer_verschuiving.setter
    def perceelnummer_verschuiving(self, perceelnummer_verschuiving):
        """Sets the perceelnummer_verschuiving of this KadastraalOnroerendeZaak.


        :param perceelnummer_verschuiving: The perceelnummer_verschuiving of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: TypePerceelnummerVerschuiving
        """

        self._perceelnummer_verschuiving = perceelnummer_verschuiving

    @property
    def adressen(self):
        """Gets the adressen of this KadastraalOnroerendeZaak.  # noqa: E501


        :return: The adressen of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: list[LocatieKadastraalObject]
        """
        return self._adressen

    @adressen.setter
    def adressen(self, adressen):
        """Sets the adressen of this KadastraalOnroerendeZaak.


        :param adressen: The adressen of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: list[LocatieKadastraalObject]
        """

        self._adressen = adressen

    @property
    def zakelijk_gerechtigde_identificaties(self):
        """Gets the zakelijk_gerechtigde_identificaties of this KadastraalOnroerendeZaak.  # noqa: E501

        Alle personen en rechtspersonen die een zakelijk recht hebben op deze kadastaraal onroerende zaak  # noqa: E501

        :return: The zakelijk_gerechtigde_identificaties of this KadastraalOnroerendeZaak.  # noqa: E501
        :rtype: list[str]
        """
        return self._zakelijk_gerechtigde_identificaties

    @zakelijk_gerechtigde_identificaties.setter
    def zakelijk_gerechtigde_identificaties(self, zakelijk_gerechtigde_identificaties):
        """Sets the zakelijk_gerechtigde_identificaties of this KadastraalOnroerendeZaak.

        Alle personen en rechtspersonen die een zakelijk recht hebben op deze kadastaraal onroerende zaak  # noqa: E501

        :param zakelijk_gerechtigde_identificaties: The zakelijk_gerechtigde_identificaties of this KadastraalOnroerendeZaak.  # noqa: E501
        :type: list[str]
        """

        self._zakelijk_gerechtigde_identificaties = zakelijk_gerechtigde_identificaties

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, KadastraalOnroerendeZaak):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, KadastraalOnroerendeZaak):
            return True

        return self.to_dict() != other.to_dict()