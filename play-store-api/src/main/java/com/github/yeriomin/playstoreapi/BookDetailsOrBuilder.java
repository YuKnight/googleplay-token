// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/GooglePlay.proto

package com.github.yeriomin.playstoreapi;

public interface BookDetailsOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // repeated .BookSubject subject = 3;
  /**
   * <code>repeated .BookSubject subject = 3;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.BookSubject> 
      getSubjectList();
  /**
   * <code>repeated .BookSubject subject = 3;</code>
   */
  com.github.yeriomin.playstoreapi.BookSubject getSubject(int index);
  /**
   * <code>repeated .BookSubject subject = 3;</code>
   */
  int getSubjectCount();
  /**
   * <code>repeated .BookSubject subject = 3;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.BookSubjectOrBuilder> 
      getSubjectOrBuilderList();
  /**
   * <code>repeated .BookSubject subject = 3;</code>
   */
  com.github.yeriomin.playstoreapi.BookSubjectOrBuilder getSubjectOrBuilder(
      int index);

  // optional string publisher = 4;
  /**
   * <code>optional string publisher = 4;</code>
   */
  boolean hasPublisher();
  /**
   * <code>optional string publisher = 4;</code>
   */
  java.lang.String getPublisher();
  /**
   * <code>optional string publisher = 4;</code>
   */
  com.google.protobuf.ByteString
      getPublisherBytes();

  // optional string publicationDate = 5;
  /**
   * <code>optional string publicationDate = 5;</code>
   */
  boolean hasPublicationDate();
  /**
   * <code>optional string publicationDate = 5;</code>
   */
  java.lang.String getPublicationDate();
  /**
   * <code>optional string publicationDate = 5;</code>
   */
  com.google.protobuf.ByteString
      getPublicationDateBytes();

  // optional string isbn = 6;
  /**
   * <code>optional string isbn = 6;</code>
   */
  boolean hasIsbn();
  /**
   * <code>optional string isbn = 6;</code>
   */
  java.lang.String getIsbn();
  /**
   * <code>optional string isbn = 6;</code>
   */
  com.google.protobuf.ByteString
      getIsbnBytes();

  // optional int32 numberOfPages = 7;
  /**
   * <code>optional int32 numberOfPages = 7;</code>
   */
  boolean hasNumberOfPages();
  /**
   * <code>optional int32 numberOfPages = 7;</code>
   */
  int getNumberOfPages();

  // optional string subtitle = 8;
  /**
   * <code>optional string subtitle = 8;</code>
   */
  boolean hasSubtitle();
  /**
   * <code>optional string subtitle = 8;</code>
   */
  java.lang.String getSubtitle();
  /**
   * <code>optional string subtitle = 8;</code>
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  // repeated .BookAuthor author = 9;
  /**
   * <code>repeated .BookAuthor author = 9;</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.BookAuthor> 
      getAuthorList();
  /**
   * <code>repeated .BookAuthor author = 9;</code>
   */
  com.github.yeriomin.playstoreapi.BookAuthor getAuthor(int index);
  /**
   * <code>repeated .BookAuthor author = 9;</code>
   */
  int getAuthorCount();
  /**
   * <code>repeated .BookAuthor author = 9;</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.BookAuthorOrBuilder> 
      getAuthorOrBuilderList();
  /**
   * <code>repeated .BookAuthor author = 9;</code>
   */
  com.github.yeriomin.playstoreapi.BookAuthorOrBuilder getAuthorOrBuilder(
      int index);

  // optional string readerUrl = 10;
  /**
   * <code>optional string readerUrl = 10;</code>
   */
  boolean hasReaderUrl();
  /**
   * <code>optional string readerUrl = 10;</code>
   */
  java.lang.String getReaderUrl();
  /**
   * <code>optional string readerUrl = 10;</code>
   */
  com.google.protobuf.ByteString
      getReaderUrlBytes();

  // optional string downloadEpubUrl = 11;
  /**
   * <code>optional string downloadEpubUrl = 11;</code>
   */
  boolean hasDownloadEpubUrl();
  /**
   * <code>optional string downloadEpubUrl = 11;</code>
   */
  java.lang.String getDownloadEpubUrl();
  /**
   * <code>optional string downloadEpubUrl = 11;</code>
   */
  com.google.protobuf.ByteString
      getDownloadEpubUrlBytes();

  // optional string downloadPdfUrl = 12;
  /**
   * <code>optional string downloadPdfUrl = 12;</code>
   */
  boolean hasDownloadPdfUrl();
  /**
   * <code>optional string downloadPdfUrl = 12;</code>
   */
  java.lang.String getDownloadPdfUrl();
  /**
   * <code>optional string downloadPdfUrl = 12;</code>
   */
  com.google.protobuf.ByteString
      getDownloadPdfUrlBytes();

  // optional string acsEpubTokenUrl = 13;
  /**
   * <code>optional string acsEpubTokenUrl = 13;</code>
   */
  boolean hasAcsEpubTokenUrl();
  /**
   * <code>optional string acsEpubTokenUrl = 13;</code>
   */
  java.lang.String getAcsEpubTokenUrl();
  /**
   * <code>optional string acsEpubTokenUrl = 13;</code>
   */
  com.google.protobuf.ByteString
      getAcsEpubTokenUrlBytes();

  // optional string acsPdfTokenUrl = 14;
  /**
   * <code>optional string acsPdfTokenUrl = 14;</code>
   */
  boolean hasAcsPdfTokenUrl();
  /**
   * <code>optional string acsPdfTokenUrl = 14;</code>
   */
  java.lang.String getAcsPdfTokenUrl();
  /**
   * <code>optional string acsPdfTokenUrl = 14;</code>
   */
  com.google.protobuf.ByteString
      getAcsPdfTokenUrlBytes();

  // optional bool epubAvailable = 15;
  /**
   * <code>optional bool epubAvailable = 15;</code>
   */
  boolean hasEpubAvailable();
  /**
   * <code>optional bool epubAvailable = 15;</code>
   */
  boolean getEpubAvailable();

  // optional bool pdfAvailable = 16;
  /**
   * <code>optional bool pdfAvailable = 16;</code>
   */
  boolean hasPdfAvailable();
  /**
   * <code>optional bool pdfAvailable = 16;</code>
   */
  boolean getPdfAvailable();

  // optional string aboutTheAuthor = 17;
  /**
   * <code>optional string aboutTheAuthor = 17;</code>
   */
  boolean hasAboutTheAuthor();
  /**
   * <code>optional string aboutTheAuthor = 17;</code>
   */
  java.lang.String getAboutTheAuthor();
  /**
   * <code>optional string aboutTheAuthor = 17;</code>
   */
  com.google.protobuf.ByteString
      getAboutTheAuthorBytes();

  // repeated group Identifier = 18 {
  /**
   * <code>repeated group Identifier = 18 { ... }</code>
   */
  java.util.List<com.github.yeriomin.playstoreapi.BookDetails.Identifier> 
      getIdentifierList();
  /**
   * <code>repeated group Identifier = 18 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.BookDetails.Identifier getIdentifier(int index);
  /**
   * <code>repeated group Identifier = 18 { ... }</code>
   */
  int getIdentifierCount();
  /**
   * <code>repeated group Identifier = 18 { ... }</code>
   */
  java.util.List<? extends com.github.yeriomin.playstoreapi.BookDetails.IdentifierOrBuilder> 
      getIdentifierOrBuilderList();
  /**
   * <code>repeated group Identifier = 18 { ... }</code>
   */
  com.github.yeriomin.playstoreapi.BookDetails.IdentifierOrBuilder getIdentifierOrBuilder(
      int index);
}